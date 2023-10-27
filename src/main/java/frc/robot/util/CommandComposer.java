// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.ArmConstants;
import frc.robot.commands.arm.ArmScoreAutoCommand;
import frc.robot.commands.arm.ArmScoreCommand;
import frc.robot.commands.arm.ManualMotorCommand;
import frc.robot.commands.arm.SpinMotor;
import frc.robot.commands.testing.LessonTwo;
import frc.robot.commands.testing.LessonTwo;
import frc.robot.subsystems.TestingSubsystem;
import frc.robot.commands.arm.ArmScoreCommand.ArmPosition;
import frc.robot.commands.util.DeferredCommand;
import frc.robot.commands.util.DeferredCommandAuto;
import frc.robot.subsystems.ArmSubsystem;

/**
 * When you need to construct long command chains, you can put those chains in
 * here instead of clogging RobotContainer.
 * <p>
 * CommandComposer also allows you to use additional logic to determine what
 * command should be executed when a Trigger is true. To do this, create a
 * static method that returns a Command, and put in logic to determine what
 * Command to execute and with what arguments
 */
public class CommandComposer {

	public static Command getSpinMotorAuto() {
		return new SpinMotor();
	}

	public static Command getLessonTwoAuto() {
		return new LessonTwo();
	}

}
