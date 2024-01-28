#!/usr/bin/env python3
import rospy
import networktables
import math
from sensor_msgs.msg import LaserScan
from networktables import NetworkTables

prev_times = []

def callback(data):
    # Get raw data from lidar
    ranges = data.ranges
    min = data.angle_min
    max = data.angle_max
    ang_incr = data.angle_increment

    # Enumerate over the distances
    for i, r in enumerate(ranges):
        # Calculate the angle that this distance corresponds to
        current_angle = 180 + int((i * ang_incr + min) * 180.0 / 3.141592)
        # Only publish every 30 deg or 45 deg
        if not (((current_angle % 45) == 0) or ((current_angle % 30) == 0)):
           continue
        # Skip points that are out of range
        if ((r < 0.5) or (r > 8.5)):
           continue #r = 0
        # Print out the value
        print(str(current_angle), "   :   ", r)
        # Assign this distance to its angle
        sd.putNumber(str(current_angle), round(r,4))

def listener():
    # Init ROS node
    rospy.init_node('ranges', anonymous=True)
    # Subscribe to the 'scan' topic, and pass in the callback which will recieve data
    rospy.Subscriber('scan', LaserScan, callback)
    # Connect to the NetworkTables server running on the rio
    NetworkTables.initialize(server="10.0.20.2")
    # Global refrence to the smart dashboard table
    global sd
    # Get the smart dashboard table
    sd = NetworkTables.getTable('SmartDashboard')

    #odom_table = NetworkTables.getTable("ODOMETRY")
    #global g
    #g = odom_table.getEntry("grid")


    #Continue running this node until it is canceled
    rospy.spin()

if __name__ == "__main__":
    listener()
