/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2667.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Instantiated Parts
	public static WPI_TalonSRX driveTrainLeftFront;
	public static WPI_TalonSRX driveTrainLeftRear;
	public static WPI_TalonSRX driveTrainRightFront;
	public static WPI_TalonSRX driveTrainRightRear;
	
	public static WPI_TalonSRX leftThrust;
	public static WPI_TalonSRX rightThrust;
	
	public static DifferentialDrive driveTrain;
	public static ADXRS450_Gyro gyro;
	public static Spark pivot;
	
	// Other Things
	public static void init() {
		// Assigning numbers to parts
		driveTrainLeftFront = new WPI_TalonSRX(1);
		driveTrainLeftRear = new WPI_TalonSRX(2);
		driveTrainRightFront = new WPI_TalonSRX(3);
		driveTrainRightRear = new WPI_TalonSRX(4);
		leftThrust = new WPI_TalonSRX(5);
		rightThrust = new WPI_TalonSRX(6);
		
		// Drive Train
		driveTrainLeftRear.follow(driveTrainLeftFront);
		driveTrainRightRear.follow(driveTrainRightFront);
		
		driveTrainLeftFront.setInverted(true);
		driveTrainRightFront.setInverted(true);
		driveTrainRightRear.setInverted(true);
		driveTrainLeftRear.setInverted(true);
		
		
		driveTrain = new DifferentialDrive(driveTrainLeftFront, driveTrainRightFront);
		gyro = new ADXRS450_Gyro();
		
		// Cube Grab
		pivot = new Spark(0);
		
	
		
	}
	
}
