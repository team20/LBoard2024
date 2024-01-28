// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot;

// import edu.wpi.first.wpilibj2.command.Command;

// public class getDistFromRandomAngle extends Command {
//   /** Creates a new getDistFromRandomAngle. */
//   public getDistFromRandomAngle() {
//     // Use addRequirements() here to declare subsystem dependencies.
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {
//     System.out.println("getDist has been run!");
//   }

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//     System.out.println("getDist execute");
//     while(true){
//       int i = (int)(Math.random() * 361);
//       System.out.println("getting the distance of angle: " + i + "...");
//       System.out.println(YDLidarSubsystem.get().getDistance(i));
//     }
//   }

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {
//     System.out.println("getDist interrupted");
//   }

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     System.out.println("getDist isFinished");
//     return false;
//   }
// }
