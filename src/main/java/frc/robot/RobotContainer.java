// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandGenericHID;
import frc.robot.Constants.ControllerConstants.Axis;

public class RobotContainer {
	private final CommandGenericHID m_driverController = new CommandGenericHID(0);
	private LeftSubsystem m_LeftSubsystem = new LeftSubsystem();
	private ArduinoSubsystem m_ArduinoSubsystem = new ArduinoSubsystem();

	private final SendableChooser<Command> m_autoChooser = new SendableChooser<>();

	public RobotContainer() {
		// m_autoChooser.addOption("Out of Community",
		// CommandComposer.getOutOfCommunityAuto(0));
		// m_autoChooser.addOption("Onto Charge Station",
		// CommandComposer.getOnToChargerAuto(0));
		// m_autoChooser.addOption("Score 1 piece",
		// CommandComposer.getScorePieceAuto());
		// m_autoChooser.addOption("Leave then balance",
		// CommandComposer.getLeaveThenBalanceAuto(1));
		// m_autoChooser.addOption("Score two and balance",
		// CommandComposer.getTwoScoreBalanceAuto());
		SmartDashboard.putData(m_autoChooser);
		SmartDashboard.putData("gwjrijgeni", m_autoChooser);
		configureButtonBindings();
	}

	private void configureButtonBindings() {
		// m_armSubsystem.setDefaultCommand(
		// new ManualMotorCommand(() -> -m_driverController1.getLeftY(), () ->
		// -m_driverController1.getRightY()));
		m_LeftSubsystem.setDefaultCommand(new DefaultDriveCommand(m_LeftSubsystem, 
			() -> m_driverController.getRawAxis(Axis.kLeftY)));
	}

	public Command getAutonomousCommand() {
		return new SpinMotor();
	}

}
