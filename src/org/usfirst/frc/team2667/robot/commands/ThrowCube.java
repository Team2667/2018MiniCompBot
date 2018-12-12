package org.usfirst.frc.team2667.robot.commands;

import org.usfirst.frc.team2667.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ThrowCube extends Command{
	
	public ThrowCube() {
		requires(Robot.grabThrust);
	}
	
	@Override
	protected void initialize() {
		
	}
	
	@Override
	protected void execute() {
		System.out.println("############  attempting to throw cube  ############");
		Robot.grabThrust.throwCube();
	}
	
	@Override
	protected void end() {
		Robot.grabThrust.stop();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void interrupted() {
		end();
	}
}
