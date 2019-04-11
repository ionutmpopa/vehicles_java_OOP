package com.iopo;

public abstract class Mercedes extends Car {

	private double availableFuel;
	private String chassisNumber;
	private float consumptionPer100Km;
	private double fuelTankSize;
	private String fuelType;
	private int gears;
	private double initialFuel;
	private double numberOfKM;
	private int tireSize;

	protected Mercedes(String chassisNumber, double availableFuel, double fuelTankSize, String fuelType, int gears,
			float consumptionPer100Km, int tireSize) {
		this.chassisNumber = chassisNumber;
		this.availableFuel = availableFuel;
		this.initialFuel = availableFuel;
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.gears = gears;
		this.consumptionPer100Km = consumptionPer100Km;
		this.tireSize = tireSize;
	}

	@Override
	public double drive(double number, int rev) {
		numberOfKM = getNumberOfKM() + number;
		System.out.println("drives " + number + " KMs, " + rev + " rpm.");
		return getAverageFuelConsumption(showRemainingFuel(number), rev);
	}

	@Override
	public double getAvailableFuel() {
		return this.availableFuel;
	}

	protected double getAverageFuelConsumption(double availableFuel, int rev) {
		double fuelRemained = getInitialFuel() - availableFuel;
		double avgConsumption = (fuelRemained * 100) / this.numberOfKM;

		if ((rev > 3000) && (rev <= 4000)) {
			double surplus = 0.1 * avgConsumption;
			return avgConsumption + surplus;
		} else if ((rev > 4000) && (rev <= 5500)) {
			double surplus = 0.2 * avgConsumption;
			return avgConsumption + surplus;
		} else if (rev > 5500) {
			double surplus = 0.3 * avgConsumption;
			System.out.println("Too many rpm, you might consider changing gears!");
			return avgConsumption + surplus;
		} else {
			return avgConsumption;
		}
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public double getInitialFuel() {
		return initialFuel;
	}

	public double getNumberOfKM() {
		return numberOfKM;
	}

	public int getTireSize() {
		return tireSize;
	}

	public float getConsumptionPer100Km() {
		return consumptionPer100Km;
	}

	public double getFuelTankSize() {
		return fuelTankSize;
	}

	public String getFuelType() {
		return fuelType;
	}

	public int getGears() {
		return gears;
	}

	@Override
	public void resetFuelConsumption(float consumption) {
		System.out.println("Average consumption has been reset to " + consumption);
	}

	public void setAvailableFuel(double availableFuel) {
		this.availableFuel = availableFuel;
	}

	@Override
	public int shiftGear(int gear) {
		if ((gear < 0) || (gear > 6)) {
			System.out.println("Invalid value!");
			this.stop();
			return -1;
		} else if (gear == 0) {
			System.out.println("The car has stopped!");
			this.stop();
		}
			System.out.println("Drives in " + gear + " gear");
			return gear;

	}

	private double showRemainingFuel(double numberKm) {
		double consumption = (getConsumptionPer100Km() * numberKm) / 100;
		double availableFuel = getAvailableFuel() - consumption;
		setAvailableFuel(availableFuel);
		return availableFuel;
	}
}