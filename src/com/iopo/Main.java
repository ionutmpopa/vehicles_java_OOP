package com.iopo;

import java.text.DecimalFormat;

public class Main {

	private static final DecimalFormat df = new DecimalFormat("###.##");

	public static void main(String[] args) {

		Car vehicle1 = new CKlasse("123456789", 45);

		double totalAverage = calculateAverageConsumption(vehicle1);
		System.out.println("Average consumption for this trip is: " + df.format(totalAverage));

		System.out.println("##########################################");
		Car vehicle2 = new SKlasse("1334323456", 40);

		totalAverage = calculateAverageConsumption(vehicle2);
		System.out.println("Average consumption for this trip is: " + df.format(totalAverage));
	}

	private static double calculateAverageConsumption(Car vehicle) {
		double average;

		vehicle.start();

		vehicle.shiftGear(1);
		average = vehicle.drive(0.1, 2800);
		
		vehicle.shiftGear(2);
		average = (average + vehicle.drive(0.3, 2900)) / 2;
		
		vehicle.shiftGear(3);
		average = (average + vehicle.drive(0.5, 3300)) / 2;
		
		vehicle.shiftGear(4);
		average = (average + vehicle.drive(50, 3500)) / 2;
		
		vehicle.shiftGear(3);
		average = (average + vehicle.drive(10, 2800)) / 2;
		
		vehicle.shiftGear(4);
		average = (average + vehicle.drive(2.00, 3000)) / 2;
		
		vehicle.shiftGear(5);
		average = (average + vehicle.drive(20.00, 2800)) / 2;
		vehicle.stop();

		return average;
	}
}
