package org.usfirst.frc.team2667.robot.commands;

import org.usfirst.frc.team2667.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeCube extends Command{
	public IntakeCube() {
		requires(Robot.grabThrust);
	}
	
	@Override
	protected void initialize() {
		
	}

	
	@Override
	protected void execute() {
		Robot.grabThrust.intakeCube();
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
