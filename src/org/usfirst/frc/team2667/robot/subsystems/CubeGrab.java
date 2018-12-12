package org.usfirst.frc.team2667.robot.subsystems;

import org.usfirst.frc.team2667.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CubeGrab extends Subsystem{
	
@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	private final Spark pivot = RobotMap.pivot;
	
	
	public void raise() {
		pivot.set(.5);
	}
	
	public void lower() {
		pivot.set(-.85);
	}
	
	public void stop() {
		pivot.set(0);
	}
}
