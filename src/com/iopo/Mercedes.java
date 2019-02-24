package com.iopo;

import java.text.DecimalFormat;

public abstract class Mercedes extends Car{

    DecimalFormat df = new DecimalFormat("###.##");

	private String chassisNumber;
	private double availableFuel;

    public Mercedes(String chassisNumber, double availableFuel) {
        this.chassisNumber = chassisNumber;
        this.availableFuel = availableFuel;
    }

    @Override
	public void start() {
		System.out.println("The car has started.");
        System.out.println("Available fuel is: " + df.format(getAvailableFuel()));
        setAverageFuelConsumption(0f);
	}

	@Override
	public void stop() {
		System.out.println("The car has stopped.");
        System.out.println("Available fuel is: " + df.format(getAvailableFuel()));

	}

	@Override
	public double drive(double number, int rev) {
		return 0;
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


    public void setAverageFuelConsumption(float avConcumption){
        float averageConsumption = avConcumption;
        System.out.println("Average consumption has been reset to " + averageConsumption);
    }

    @Override
    public double getAverageFuelConsumption(double availableFuel, int rev) {
        return 0;
    }

    void setAvailableFuel(double availableFuel) {
        this.availableFuel = availableFuel;
    }

    @Override
    public double getAvailableFuel() {
        return this.availableFuel;
    }
}
