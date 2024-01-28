// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;

public class DriveDistanceLidar extends Command {
  /** Creates a new driveDistanceLidar. */
  public DriveDistanceLidar() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(LeftSubsystem.get());
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    YDLidarSubsystem.get().getDistance(180);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    LeftSubsystem.get().setBottomMotorSpeed(.6);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    LeftSubsystem.get().setBottomMotorSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    double distance = YDLidarSubsystem.get().getDistance(180);
    System.out.println(distance);
    return distance>=1;
  }
}
