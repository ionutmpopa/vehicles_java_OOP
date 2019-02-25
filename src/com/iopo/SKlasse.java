package com.iopo;

import java.text.DecimalFormat;

public class SKlasse extends Mercedes {

    DecimalFormat df = new DecimalFormat("###.##");

    private static final double fuelTankSize = 51.00;
    private static final String fuelType = "PETROL";
    private static final int gears = 6;
    private static final float consumptionPer100Km = 6.0f;
    private final int tireSize;
    private double initialFuel;
    private double numberOfKM;

    public SKlasse(String chassisNumber, int availableFuel) {
        super(chassisNumber, availableFuel);
        this.initialFuel = availableFuel;
        this.tireSize = 18;
    }

    @Override
    public double drive(double number, int rev) {
        this.numberOfKM += number;
        System.out.println("drives " + number + " KMs, " + rev + " rpm.");
        System.out.println("The average fuel consumption is: " + df.format(this.getAverageFuelConsumption(showAvailableFuel(number), rev)));
        return this.numberOfKM;
    }

    @Override
    public double getAverageFuelConsumption(double availableFuel, int rev){
        double fuelRemained = this.getInitialFuel() - super.getAvailableFuel();
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

    public double showAvailableFuel (double numberOfKm) {

        double consumption = (consumptionPer100Km * numberOfKm) / 100;
        double availableFuel = this.getAvailableFuel() - consumption;
        super.setAvailableFuel(availableFuel);
        return availableFuel;
    }

    public double getInitialFuel() {
        return initialFuel;
    }

    public static float getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public static double getFuelTankSize() {
        return fuelTankSize;
    }

    public static String getFuelType() {
        return fuelType;
    }

    public static int getGears() {
        return gears;
    }
}
