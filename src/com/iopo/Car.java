package com.iopo;

import java.text.DecimalFormat;

public abstract class Car implements Vehicle {

    DecimalFormat df = new DecimalFormat("###.##");


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
	public void setAverageFuelConsumption(float avConcumption){
		float averageConsumption = avConcumption;
		System.out.println("Average consumption has been reset to " + averageConsumption);
	}

	    public abstract double drive(double number, int rev);
	    public abstract int shiftGear(int gear);
		public abstract double getAvailableFuel();
}
