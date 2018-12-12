package org.usfirst.frc.team2667.robot.util;

public enum XboxControllerEnum {
	A(1),
	B(2),
	X(3),
	Y(4),
	LEFT_BUMPER(5),
	RIGHT_BUMPER(6),
	BACK(7),
	START(8),
	LEFT_ANALOG_STICK_BUTTON(9),
	RIGHT_ANALOG_STICK_BUTTON(10);
	
	private int id;
	
	XboxControllerEnum(int id) {
		this.id = id;
	}
	
}