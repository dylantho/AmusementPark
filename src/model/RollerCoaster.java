package model;

/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class RollerCoaster {
	private String name;
	private int lengthSec;
	private int lengthFeet;
	private int maxHeight;
	private int capacity;
	
	public RollerCoaster() {
		super();
	}
	
	public RollerCoaster(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLengthSec() {
		return lengthSec;
	}

	public void setLengthSec(int lengthSec) {
		this.lengthSec = lengthSec;
	}

	public int getLengthFeet() {
		return lengthFeet;
	}

	public void setLengthFeet(int lengthFeet) {
		this.lengthFeet = lengthFeet;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	// Calculates the average speed of a roller coaster
	public int calculateAverageSpeed(RollerCoaster coaster) {
		final double FEET_IN_MILE = 5280;
		final double SEC_IN_HOUR = 3600;
		double milesPerHour;
		double lengthMiles;
		double lengthHours;
		
		lengthMiles = coaster.getLengthFeet() / FEET_IN_MILE;
		lengthHours = coaster.getLengthSec() / SEC_IN_HOUR;
		
		milesPerHour = lengthMiles / lengthHours;
		
		return (int) milesPerHour;
	}
	
	// Classifies a coaster based on its max height
	public String classifyCoasterByHeight(RollerCoaster coaster) {
		String classification;
		int kiddieCoaster = 25;
		int hyperCoaster = 200;
		int gigaCoaster = 300;
		int strataCoaster = 400;
		
		if (coaster.getMaxHeight() <= kiddieCoaster) {
			classification = "Kiddie coaster";
		}
		else if (coaster.getMaxHeight() > kiddieCoaster && coaster.getMaxHeight() < hyperCoaster) {
			classification = "Not a kiddie coaster, but not quite a hyper coaster";
		}
		else if (coaster.getMaxHeight() >= hyperCoaster && coaster.getMaxHeight() < gigaCoaster) {
			classification = "Hyper coaster";
		}
		else if (coaster.getMaxHeight() >= gigaCoaster && coaster.getMaxHeight() < strataCoaster) {
			classification = "Giga coaster";
		}
		else {
			classification = "Strata coaster";
		}
		return classification;
	}

}
