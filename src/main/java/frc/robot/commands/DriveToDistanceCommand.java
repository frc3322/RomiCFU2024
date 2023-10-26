// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Constants.DriveConstants;
import frc.robot.subsystems.RomiDrivetrain;

/** A command that will turn the robot to the specified angle. */
public class DriveToDistanceCommand extends PIDCommand {

  private RomiDrivetrain drivetrain;
  private double targetDist;


  // Create a Drive To Distance Command that takes in 2 parameters: the target distance and the drivetain.
  
  // Inside this super, write the PID controller code:
  // super(
      /*Write PID Controller in Here */
  // )

  public DriveToDistanceCommand() {
    super(
      
    );
  }

//Log the controller values in SmartDashbaard

  // }
  
  @Override
  public void initialize() {
    drivetrain.resetEncoders();
  }

  @Override
  public boolean isFinished() {
    // End when the controller is at the reference.
    return getController().atSetpoint();
  }
}