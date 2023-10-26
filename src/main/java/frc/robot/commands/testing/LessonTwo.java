// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.testing;

import java.time.Duration;
import java.time.Instant;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TestingSubsystem;

public class LessonTwo extends CommandBase {
	
	private Instant m_startTime;

	/** Creates a new lessonTwo. */
	public LessonTwo() {
		// Use addRequirements() here to declare subsystem dependencies.
		addRequirements(TestingSubsystem.get());
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
		m_startTime = Instant.now();
		// TODO: something needs to be here...
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		// TODO: something also needs to be here...
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		if (Duration.between(m_startTime, Instant.now()).toMillis() > 10000) {
			return true;
		}
		return false;
	}
}
