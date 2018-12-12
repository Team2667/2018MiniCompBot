package org.usfirst.frc.team2667.robot.subsystems;

import org.usfirst.frc.team2667.robot.RobotMap;
import org.usfirst.frc.team2667.robot.commands.Drive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem{
	//Instantiated Variables
	private final DifferentialDrive drive = RobotMap.driveTrain;
	private final ADXRS450_Gyro gyro = RobotMap.gyro;
	private final WPI_TalonSRX leftFront = RobotMap.driveTrainLeftFront;
	private final WPI_TalonSRX leftRear = RobotMap.driveTrainLeftRear;
	private final WPI_TalonSRX rightFront = RobotMap.driveTrainRightFront;
	private final WPI_TalonSRX rightRear = RobotMap.driveTrainRightRear;
	
	//Methods
	@Override
    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());
    }
	
	public void arcadeDrive(Joystick joy) {
		drive.arcadeDrive(joy.getY(), joy.getX());
	}
	
	public void arcadeDrive(double speed, double turn) {
		drive.arcadeDrive(speed, turn);
	}
	
	public void stop() {
		leftFront.stopMotor();
		leftRear.stopMotor();
		rightFront.stopMotor();
		rightRear.stopMotor();
	}

}
