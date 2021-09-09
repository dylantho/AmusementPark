package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ThrillRide;

/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class TestThrillRide {
	ThrillRide sidewinder = new ThrillRide("Sidewinder");

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testPassengerTallEnough() {
		sidewinder.setHeightRequirementInches(45);
		assertTrue(sidewinder.passengerTallEnough(sidewinder, 46));
	}

	@Test
	public void testPassengerNotTallEnough() {
		sidewinder.setHeightRequirementInches(45);
		assertFalse(sidewinder.passengerTallEnough(sidewinder, 36));
	}
	
	@Test
	public void testCalculateRevenuePerHour() {
		sidewinder.setCost(10);
		sidewinder.setPassengersPerHour(60);
		double revenue = sidewinder.calculateRevenuePerHour(sidewinder);
		assertEquals(600, revenue, 0.0);
	}

}
