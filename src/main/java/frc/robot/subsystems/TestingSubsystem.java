// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxAbsoluteEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.SparkMaxLimitSwitch;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.filter.LinearFilter;
import edu.wpi.first.math.filter.MedianFilter;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants.LeftConstants;

public class TestingSubsystem extends SubsystemBase {
	private static TestingSubsystem s_subsystem;
	// TODO: 2 things need here... -> Objects

	/* Encoders are for another time...lets focus 1 at a time */
	private final SparkMaxAbsoluteEncoder m_lowerArmEncoder = m_topMotor
			.getAbsoluteEncoder(SparkMaxAbsoluteEncoder.Type.kDutyCycle);
	private final SparkMaxAbsoluteEncoder m_upperArmEncoder = m_bottomMotor
			.getAbsoluteEncoder(SparkMaxAbsoluteEncoder.Type.kDutyCycle);

	private final SparkMaxPIDController m_topController = m_topMotor.getPIDController();
	private final SparkMaxPIDController m_bottomController = m_bottomMotor.getPIDController();

	/** Creates a new testingSubsystem. */
	public TestingSubsystem() {
		if (s_subsystem != null) {
			try {
				throw new Exception("Arm subsystem already initialized!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		s_subsystem = this;
		m_topMotor.restoreFactoryDefaults();
		m_topMotor.setIdleMode(/* TODO: What could be here...? */);
		m_topMotor.enableVoltageCompensation(12);
		m_topMotor.setSmartCurrentLimit(/* TODO: What could be here...? */);

		m_bottomMotor.restoreFactoryDefaults();
		m_bottomMotor.setIdleMode(/* TODO: What could be here...? */);
		m_bottomMotor.enableVoltageCompensation(12);
		m_bottomMotor.setSmartCurrentLimit(/* TODO: What could be here...? */);
	}

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
	}

	public static TestingSubsystem get() {
		return s_subsystem;
	}

	/* TODO: You are going to want 2 setters here for speed... */
}
