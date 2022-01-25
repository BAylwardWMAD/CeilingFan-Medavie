package com.medavie.jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.medavie.ceilingFan.CeilingFan;

class CeilingFanTests {

	@Test
	void testFanSpeedIsOff() {
		CeilingFan cf = new CeilingFan();
		assertEquals(0, cf.getSpeed());		
	}
	
	@Test
	void testFanSpeedIsOne() {
		CeilingFan cf = new CeilingFan();
		cf.pullSpeedCord();
		assertEquals(1, cf.getSpeed());
	}
	
	@Test
	void testFanSpeedIsTwo() {
		CeilingFan cf = new CeilingFan();
		cf.pullSpeedCord();
		cf.pullSpeedCord();
		assertEquals(2, cf.getSpeed());
	}
	
	@Test
	void testFanSpeedIsThree() {
		CeilingFan cf = new CeilingFan();
		cf.pullSpeedCord();
		cf.pullSpeedCord();
		cf.pullSpeedCord();
		assertEquals(3, cf.getSpeed());
	}
	
	@Test
	void testFanSpeedCycleCompleteAndOff() {
		CeilingFan cf = new CeilingFan();
		cf.pullSpeedCord();
		cf.pullSpeedCord();
		cf.pullSpeedCord();
		cf.pullSpeedCord();
		assertEquals(0, cf.getSpeed());
	}
	
	@Test
	void testDirectionIsForward() {
		CeilingFan cf = new CeilingFan();
		assertFalse(cf.isReversed());	
	}
	
	@Test
	void testDirectionIsReverse() {
		CeilingFan cf = new CeilingFan();
		cf.pullDirectionCord();
		assertTrue(cf.isReversed());	
	}
	
	@Test
	void testSpeedAndDirection() {
		CeilingFan cf = new CeilingFan();
		assertFalse(cf.isReversed());
		assertEquals(0, cf.getSpeed());
		cf.pullDirectionCord();
		cf.pullSpeedCord();
		assertTrue(cf.isReversed());			
	}
}
