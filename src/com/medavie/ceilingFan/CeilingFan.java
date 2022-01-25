package com.medavie.ceilingFan;

/*
 * Author: Brian Aylward
 * Date: 2022-01-25
 */
public class CeilingFan {
	
	private int speed = 0;
	private boolean direction = false;
	
	/**
	 * Returns the direction of the ceiling fan
	 * @return False if the ceiling fan is not reversed, True if the ceiling fan is reversed
	 */
	public boolean isReversed() {
		return direction;
	}
	
	/**
	 * Returns the current ceiling fan speed
	 * @return The ceiling fan speed represented as an Integer
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Changes the ceiling fan speed
	 * Every pull increases the fan speed by 1, to maximum of 3
	 * On reaching maximum ceiling fan speed, an additional pull will
	 * reset the fan speed back to 0/OFF
	 */
	public void pullSpeedCord() {
		this.speed++;
		if(this.speed > 3) {
			this.speed = 0;
		}
	}
	
	/**
	 * Changes the ceiling fans direction
	 */
	public void pullDirectionCord() {
		this.direction = !this.direction;
	}	

}
