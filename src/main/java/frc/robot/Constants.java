package frc.robot;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.SPI;

public final class Constants {
	public static final class ArduinoConstants {
		/**
		 * The I2C address of the Arduino as defined by the address passed into
		 * Wire.begin() in the Arduino code
		 */
		public static final int kAddress = 0x18;
	}

	public static final class ArmConstants {
		// Preset angles for arm
		/**
		 * The lower and upper arm angles for the arm to reach the high node while
		 * forwards
		 */
		public static final double[] kHighAngles = { 55, 160 };
		// {46,225}
		/**
		 * The lower and upper arm angles for the arm to be in an intermediate position
		 * needed to prevent the arm from colliding with the grid when reaching for the
		 * high node
		 */
		public static final double[] kHighIntermediateAngles = { (90 + (kHighAngles[0])) / 2, kHighAngles[1] };
		/**
		 * The lower and upper arm angles for the arm to reach the high node while
		 * backwards
		 */
		public static final double[] kHighBackAngles = { 109, 236 };
		/**
		 * The lower and upper arm angles for the arm to reach the medium node while
		 * backwards
		 */
		public static final double[] kMediumBackAngles = { 94.5, 279 }; // 95, 281
		/**
		 * The lower and upper arm angles for the arm to reach the medium node while
		 * forwards. They also happen to be the angles needed to reach the shelf.
		 */
		public static final double[] kMediumForwardAngles = { 83, 108 };
		/** The lower and upper arm angles for the arm to be in the low position */
		public static final double[] kLowAngles = { 80, 38 };

		public static final double[] kLowAutoAngles = { 78, 48 };

		/** The lower and upper arm angles for the arm to be in the frame pocket */
		public static final double[] kPocketAngles = { 106, 22 };

		public static final double[] kSubstationAngles = { 84, 106 };

		/**
		 * The lower and upper arm angles for the arm to be in an intermediate position
		 * so when the arm moves from the pocket position to any other position, the
		 * gripper doesn't hit the frame while doing so.
		 */
		public static final double[] kPocketIntermediateAngles = { kPocketAngles[0] + 15, 22 };

		/**
		 * The lower and upper arm angles for the arm to be in an intermediate position
		 * needed to prevent the arm from going over the height limit when transitioning
		 * between forward and backward positions
		 */
		public static final double[] kIntermediateAngles = { 50, 270 };

		/**
		 * The lower and upper arm angles for the arm to be in an intermediate position
		 * needed to prevent the arm from going over the height limit when transitioning
		 * from a forward position to a backward position
		 */
		public static final double[] kToBackIntermediateAngles = { 50, 270 };
		/**
		 * The lower and upper arm angles for the arm to be in an intermediate position
		 * needed to prevent the arm from going over the height limit when transitioning
		 * from a backward position to a forward position
		 */
		public static final double[] kToFwdIntermediateAngles = { 130, 90 };
		// TODO remeasure arm lengths
		/** Length of lower arm length in inches */
		public static final double kLowerArmLength = 33;
		/** Length of upper arm length in inches */
		public static final double kUpperArmLength = 42;

		// TODO check arm speed multipliers
		/**
		 * Controls how fast the arm moves when the joysticks are moved.
		 * <p>
		 * This affects the speed of the arm's horizontal and vertical movement.
		 */
		public static final double kCartesianSpeedSensitivity = 1.5;
		/**
		 * When using the ManualMotorCommand, this controls the speed of the arm motors
		 * when the joysticks are moved.
		 * <p>
		 * This only affects how fast the arm's motors spin when using the
		 * ManualMotorCommand.
		 */
		public static final double kArmMotorSpeedSensitivity = 1;

		// TODO Check allowable error, and max angle and height values
		/**
		 * Allowable difference in degrees between the target arm angle and the current
		 * arm angle
		 */
		public static final double kAllowedDegreesError = 3;
		/** Smallest angle the lower arm can go */
		public static final double kAllowedDegreesErrorIntermediate = 15;
		public static final double kLowerArmMinAngle = 45;
		/** Maximum angle the lower arm can go */
		public static final double kLowerArmMaxAngle = 135;
		/** Smallest angle the lower arm can go */
		public static final double kUpperArmMinAngle = 15;
		/** Maximum angle the lower arm can go */
		public static final double kUpperArmMaxAngle = 290;
		/**
		 * Maximum height in inches the arm can reach.
		 * <p>
		 * The max height for the robot is 6 feet, 6 inches, or 78 inches.
		 * <p>
		 * The base of the robot is 10.5 inches, leaving 67.5 inches left for the arm
		 */
		public static final double kMaxHeight = 80;
		/**
		 * Number of degrees the lower arm encoder output needs to be offset so it reads
		 * 0 degrees in our zero position
		 */
		public static final double kLowerEncoderZeroOffset = 109.7;

		/**
		 * Number of degrees the upper arm encoder output needs to be offset so it reads
		 * 0 degrees in our zero position
		 */
		public static final double kUpperEncoderZeroOffset = 356.282;
		public static final int kUpperMotorID = 8;
		public static final int kLowerMotorID = 6;
		// TODO evaluate current limits
		public static final int kSmartCurrentLimit = 55;
		/**
		 * When the 2nd lower arm motor is following the 1st lower arm motor, this
		 * controls if the 2nd lower arm motor should spin in the opposite direction of
		 * the 1st motor
		 */
		// TODO PIDS
		public static final double kLowerArmP = 0.06000;
		public static final double kLowerArmI = 0.000;
		public static final double kLowerArmD = 0;
		public static final double kLowerArmIz = 5;
		public static final double kLowerArmFF = 0.0;
		/** Controls the direction of the lower arm motor */
		public static final boolean kLowerInvert = true;
		public static final double kUpperArmP = 0.04;// 0.1 -> 0.05 -> 0.07 -> 0.065 -> 0.06 -> 0.03
		public static final double kUpperArmI = 0.000;
		public static final double kUpperArmD = 0.030; // 0 -> 0.0225 -> 0.025
		public static final double kUpperArmIz = 5;
		public static final double kUpperArmFF = 0.0;
		/** Controls the direction of the upper arm motor */
		public static final boolean kUpperInvert = false;
		public static final double kMinOutputLower = -1;
		public static final double kMaxOutputLower = 1;
		public static final double kMinOutputUpper = -1;
		public static final double kMaxOutputUpper = 1;
		public static final double kLowerArmInvalidLowerBound = 40;
		public static final double kLowerArmInvalidUpperBound = 120;
	}

	public static final class LeftConstants {
		public static final int kTopMotorID = 4;
		public static final int kBottomMotorID = 3;
		// TODO evaluate current limits
		public static final int kSmartCurrentLimit = 55;
	}

	public static final class ControllerConstants {
		public static final int kDriverControllerPort = 0;
		public static final int kOperatorControllerPort = 1;
		public static final double kDeadzone = 0.1;
		public static final double kTriggerDeadzone = .05;

		public static final class Axis {
			public static final int kLeftX = 0;
			public static final int kLeftY = 1;
			public static final int kRightX = 2;
			public static final int kLeftTrigger = 3;
			public static final int kRightTrigger = 4;
			public static final int kRightY = 5;
		}

		public static final class Button {
			/** Left middle button */
			public static final int kSquare = 1;
			/** Bottom button */
			public static final int kX = 2;
			/** Right middle button */
			public static final int kCircle = 3;
			/** Top button */
			public static final int kTriangle = 4;
			public static final int kLeftBumper = 5;
			public static final int kRightBumper = 6;
			public static final int kLeftTrigger = 7;
			public static final int kRightTrigger = 8;
			public static final int kShare = 9;
			public static final int kOptions = 10;
			public static final int kLeftStick = 11;
			public static final int kRightStick = 12;
			public static final int kPS = 13;
			public static final int kTrackpad = 14;
		}

		public static final class DPad {
			public static final int kUp = 0;
			public static final int kRight = 90;
			public static final int kDown = 180;
			public static final int kLeft = 270;
		}
	}

}