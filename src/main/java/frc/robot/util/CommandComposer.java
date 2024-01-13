// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.arm.SpinMotor;

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

}
