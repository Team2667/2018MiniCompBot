package org.usfirst.frc.team2667.robot.subsystems;

import org.usfirst.frc.team2667.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GrabThrust extends Subsystem{

	
@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
		
	}

	public void intakeCube() {
		RobotMap.leftThrust.set(1);
		RobotMap.rightThrust.set(-1);
	}
	
	public void throwCube() {
		RobotMap.leftThrust.set(-1);
		RobotMap.rightThrust.set(1);
	}
	
	public void stop() {
		RobotMap.leftThrust.set(0);
		RobotMap.rightThrust.set(0);
	}
	
	
}
