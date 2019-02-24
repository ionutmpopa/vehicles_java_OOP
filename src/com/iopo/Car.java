package com.iopo;

public abstract class Car implements Vehicle {


	    public abstract void start();
	    public abstract void stop();
	    public abstract double drive(double number, int rev);
	    public abstract int shiftGear(int gear);
		public abstract double getAvailableFuel();
		public abstract double getAverageFuelConsumption(double availableFuel, int rev);


}
