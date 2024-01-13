// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.networktables.NetworkTableListener;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;

public class RobotContainer {

	private final CommandPS4Controller m_driverController1 = new CommandPS4Controller(0);
	private final SendableChooser<Command> m_autoChooser = new SendableChooser<>();

	public RobotContainer() {
		// m_autoChooser.addOption("Out of Community",
		// CommandComposer.getOutOfCommunityAuto(0));
		// m_autoChooser.addOption("Onto Charge Station",
		// CommandComposer.getOnToChargerAuto(0));
		// m_autoChooser.addOption("Score 1 piece",
		// CommandComposer.getScorePieceAuto());
		// m_autoChooser.addOption("Leave then balance",
		// CommandComposer.getLeaveThenBalanceAuto(1));// TODO fix distance
		// m_autoChooser.addOption("Score two and balance",
		// CommandComposer.getTwoScoreBalanceAuto());
		SmartDashboard.putData(m_autoChooser);
		SmartDashboard.putData("gwjrijgeni", m_autoChooser);
		configureButtonBindings();
	}

	private void configureButtonBindings() {

	}

	// TODO get auto command from auto chooser
	public Command getAutonomousCommand() {
		return null;
	}

}
