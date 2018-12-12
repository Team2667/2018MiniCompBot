package org.usfirst.frc.team2667.robot.util;

public enum LogitechControllerEnum {
	A(1),
	B(2),
	X(3),
	Y(4),
	LEFT_BUMPER(5),
	RIGHT_BUMPER(6),
	LEFT_TRIGGER(7),
	RIGHT_TRIGGER(8),
	BACK(9),
	START(10),
	LEFT_ANALOG_STICK_BUTTON(11),
	RIGHT_ANALOG_STICK_BUTTON(12);
	
	private int id;
	
	LogitechControllerEnum(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
