package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.RollerCoaster;

/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class TestRollerCoaster {
	RollerCoaster milleniumForce = new RollerCoaster("Millenium Force");
	RollerCoaster topThrill = new RollerCoaster("Top Thrill Dragster");
	RollerCoaster mamba = new RollerCoaster("Mamba");
	RollerCoaster bearTrax = new RollerCoaster("Bear Trax");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateAverageSpeed() {
		milleniumForce.setLengthFeet(6595);
		milleniumForce.setLengthSec(120);
		
		topThrill.setLengthFeet(2800);
		topThrill.setLengthSec(17);
		
		double averageSpeedForce = milleniumForce.calculateAverageSpeed(milleniumForce);
		double averageSpeedThrill = topThrill.calculateAverageSpeed(topThrill);
		assertEquals(37, averageSpeedForce, 0.0);
		assertEquals(112, averageSpeedThrill, 0.0);
	}
	
	@Test
	public void classifyCoasterByHeight() {
		milleniumForce.setMaxHeight(310);
		topThrill.setMaxHeight(420);
		mamba.setMaxHeight(205);
		bearTrax.setMaxHeight(12);

		String classifyForce = milleniumForce.classifyCoasterByHeight(milleniumForce);
		String classifyThrill = topThrill.classifyCoasterByHeight(topThrill);
		String classifyMamba = mamba.classifyCoasterByHeight(mamba);
		String classifyBearTrax = bearTrax.classifyCoasterByHeight(bearTrax);
		assertEquals("Giga coaster", classifyForce);
		assertEquals("Strata coaster", classifyThrill);
		assertEquals("Hyper coaster", classifyMamba);
		assertEquals("Kiddie coaster", classifyBearTrax);
	}

}
