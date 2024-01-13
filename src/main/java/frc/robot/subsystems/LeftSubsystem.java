// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LeftConstants;

public class LeftSubsystem extends SubsystemBase {
	/** Stores the instance of the ArmSubsystem */
	private static LeftSubsystem s_subsystem;
	private final CANSparkMax m_bottomMotor = new CANSparkMax(LeftConstants.kBottomMotorID, MotorType.kBrushless);

	// private final SparkMaxAbsoluteEncoder m_upperArmEncoder = m_bottomMotor
	// .getAbsoluteEncoder(SparkMaxAbsoluteEncoder.Type.kDutyCycle);

	// private final SparkMaxPIDController m_bottomController =
	// m_bottomMotor.getPIDController();

	/** Creates a new LeftSubsystem. */
	public LeftSubsystem() {
		if (s_subsystem != null) {
			try {
				throw new Exception("Left subsystem already initialized!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		s_subsystem = this;

		m_bottomMotor.restoreFactoryDefaults();
		m_bottomMotor.setIdleMode(CANSparkMax.IdleMode.kBrake);
		m_bottomMotor.enableVoltageCompensation(12);
		m_bottomMotor.setSmartCurrentLimit(LeftConstants.kSmartCurrentLimit);
	}

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
	}

	public static LeftSubsystem get() {
		return s_subsystem;
	}

	/**
	 * Sets the percent output for the lower arm motor
	 * 
	 * @param speed The percent output to run the motor at
	 */

	public void setBottomMotorSpeed(double speed) {
		m_bottomMotor.set(speed);
	}

}
