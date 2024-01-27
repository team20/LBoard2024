// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class YDLidarSubsystem extends SubsystemBase {
	NetworkTable m_lidarTable = NetworkTableInstance.getDefault().getTable("lidar");
	private static YDLidarSubsystem s_subsystem;

	/** Creates a new YDLidarSubsystem. */
	public YDLidarSubsystem() {
		// Singleton
		if (s_subsystem != null) {
			try {
				throw new Exception("YDLidar subsystem already initialized!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		s_subsystem = this;
	}

	public static YDLidarSubsystem get() {
		return s_subsystem;
	}

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
		NetworkTable table = NetworkTableInstance.getDefault().getTable("lidar");
		NetworkTableEntry testing = table.getEntry("180");
	}
}