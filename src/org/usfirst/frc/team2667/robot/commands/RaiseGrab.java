package org.usfirst.frc.team2667.robot.commands;

import org.usfirst.frc.team2667.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RaiseGrab extends Command {
	
	public RaiseGrab() {
		requires(Robot.cubeGrab);
	}

	@Override
	protected void initialize() {
		Robot.cubeGrab.raise();
	}
	
	@Override
	protected void execute() {
		
	}
	
	@Override
	protected void end() {
		Robot.cubeGrab.stop();
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
