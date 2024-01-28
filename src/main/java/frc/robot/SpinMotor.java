// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.time.Duration;
import java.time.Instant;

import edu.wpi.first.wpilibj2.command.Command;

public class SpinMotor extends Command {

	private Instant m_startTime;

	public SpinMotor() {
		// Use addRequirements() here to declare subsystem dependencies.
		addRequirements(LeftSubsystem.get());
	}

	@Override
	public void initialize() {
		m_startTime = Instant.now();
		LeftSubsystem.get().setBottomMotorSpeed(0);
	}

	@Override
	public void execute() {
		LeftSubsystem.get().setBottomMotorSpeed(0.6);
	}

	@Override
	public void end(boolean interrupted) {
		LeftSubsystem.get().setBottomMotorSpeed(0);
	}

	@Override
	public boolean isFinished() {
		if (Duration.between(m_startTime, Instant.now()).toMillis() > 10000) {
			return true;
		}
		return false;
	}
}
