// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.arm;

import java.time.Duration;
import java.time.Instant;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class SpinMotor extends CommandBase {

	private Instant m_startTime;

	/** Creates a new SpinMotor. */
	public SpinMotor() {
		// Use addRequirements() here to declare subsystem dependencies.
		addRequirements(ArmSubsystem.get());
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
		m_startTime = Instant.now();
		ArmSubsystem.get().setUpperArmMotorSpeed(0.1);
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		ArmSubsystem.get().setUpperArmMotorSpeed(0);
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		if (Duration.between(m_startTime, Instant.now()).toMillis() > 250) {
			return true;
		}
		return false;
	}
}
