package com.iopo;

public abstract class Mercedes extends Car{

	private String chassisNumber;
	private double availableFuel;

    public Mercedes(String chassisNumber, double availableFuel) {
        this.chassisNumber = chassisNumber;
        this.availableFuel = availableFuel;
    }

	@Override
	public int shiftGear(int gear) {
		if (gear > 6) {
			System.out.println("Invalid value!");
			this.stop();
			return -1;
		}
		System.out.println("Drives in " + gear + " gear");
		return gear;
	}

    @Override
    public double getAvailableFuel() {
        return this.availableFuel;
    }

    void setAvailableFuel(double availableFuel) {
        this.availableFuel = availableFuel;
    }

    public abstract double getAverageFuelConsumption(double availableFuel, int rev);

}
