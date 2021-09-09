package model;

/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class ThrillRide {
	private String name;
	private int heightRequirementInches;
	private int passengersPerHour;
	private int cost;

	public ThrillRide() {
		super();
	}
	
	public ThrillRide(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeightRequirementInches() {
		return heightRequirementInches;
	}

	public void setHeightRequirementInches(int heightRequirementInches) {
		this.heightRequirementInches = heightRequirementInches;
	}

	public int getPassengersPerHour() {
		return passengersPerHour;
	}

	public void setPassengersPerHour(int passengersPerHour) {
		this.passengersPerHour = passengersPerHour;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	// Decides if a passenger enough is tall enough to ride the ride
	public boolean passengerTallEnough(ThrillRide thrillride, int height) {
		boolean tallEnough = false;
		
		if (height >= thrillride.getHeightRequirementInches()) {
			tallEnough = true;
		}
		return tallEnough;
	}
	
	// Calculates the revenue per hour of the ride
	public int calculateRevenuePerHour(ThrillRide thrillride) {
		int revenuePerHour = thrillride.getCost() * thrillride.getPassengersPerHour();
		return revenuePerHour;
	}
	
	

}
