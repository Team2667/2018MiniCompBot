package org.usfirst.frc.team2667.robot.commands;
import org.usfirst.frc.team2667.robot.Robot;

import org.usfirst.frc.team2667.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;


public class DriveStraight extends Command{
	double opAngle;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DriveStraight() {
    	requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
    	opAngle = 0;
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        //requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    
    public DriveStraight(double angle) {
    	opAngle = angle;
    }

    @Override
    protected void initialize() {
    	setTimeout(2.0);
    }

    @Override
    protected void execute() {
    	Robot.driveTrain.arcadeDrive(.65, 0);
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
    	System.out.println("End has been called");
    	Robot.driveTrain.stop();
    }

    @Override
    protected void interrupted() {
    	end();
    }
}
