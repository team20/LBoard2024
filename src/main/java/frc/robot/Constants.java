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

	public static final class LeftConstants {
		public static final int kBottomMotorID = 3;
		public static final int kSmartCurrentLimit = 55;
	}
}
