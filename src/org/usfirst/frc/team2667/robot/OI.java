/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2667.robot;

import org.usfirst.frc.team2667.robot.util.LogitechControllerEnum;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2667.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick joystick;
	public XboxController xbox;
	public JoystickButton grabCubeButton;
	public JoystickButton raiseGrabButton;
	public JoystickButton lowerGrabButton;
	public JoystickButton throwCube;
	public JoystickButton intakeCube;
	
    public OI() {
    	// Joystick
        joystick = new Joystick(0);
        xbox = new XboxController(1);
        
        // Joystick buttons
         grabCubeButton = new JoystickButton(joystick, LogitechControllerEnum.LEFT_TRIGGER.getId());
         raiseGrabButton = new JoystickButton(joystick, LogitechControllerEnum.X.getId());
         raiseGrabButton.whileHeld(new RaiseGrab());
         lowerGrabButton = new JoystickButton(joystick, LogitechControllerEnum.Y.getId());
         lowerGrabButton.whileHeld(new LowerGrab());
         throwCube = new JoystickButton(joystick, LogitechControllerEnum.LEFT_BUMPER.getId());
         throwCube.whileHeld(new ThrowCube());
         intakeCube = new JoystickButton(joystick, LogitechControllerEnum.RIGHT_BUMPER.getId());
         intakeCube.whileHeld(new IntakeCube());
         
         
        
        // Smartdashboard buttons
        SmartDashboard.putData("DriveStraight", new DriveStraight());
        
    }
}
