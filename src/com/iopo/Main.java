package com.iopo;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            DecimalFormat df = new DecimalFormat("###.##");

            Car vehicle1 = new CKlasse("123456789", 45);

            List<Double> calculateAverageConsumption = new LinkedList<>();

            vehicle1.start();
            vehicle1.shiftGear(1);
            calculateAverageConsumption.add(vehicle1.drive(0.1, 2800));
            vehicle1.shiftGear(2);
            calculateAverageConsumption.add(vehicle1.drive(0.3, 2900));
            vehicle1.shiftGear(3);
            calculateAverageConsumption.add(vehicle1.drive(0.5, 3300));
            vehicle1.shiftGear(4);
            calculateAverageConsumption.add(vehicle1.drive(50, 3500));
            vehicle1.shiftGear(3);
            calculateAverageConsumption.add(vehicle1.drive(10, 2800));
            vehicle1.shiftGear(4);
            calculateAverageConsumption.add(vehicle1.drive(2.00, 3000));
            vehicle1.shiftGear(5);
            calculateAverageConsumption.add(vehicle1.drive(20.00, 2800));
            vehicle1.stop();


            double sum = 0;
            double totalAverage = 0;
            for (int i = 0; i < calculateAverageConsumption.size(); i++) {
                sum += calculateAverageConsumption.get(i);
                totalAverage = sum / calculateAverageConsumption.size();
            }
            System.out.println("Average consumption for this trip is: " + df.format(totalAverage));


            System.out.println("##########################################");
            Car vehicle2 = new SKlasse("1334323456", 40);

            calculateAverageConsumption = new LinkedList<>();

            vehicle2.start();
            vehicle2.shiftGear(1);
            calculateAverageConsumption.add(vehicle2.drive(0.1, 2800));
            vehicle2.shiftGear(2);
            calculateAverageConsumption.add(vehicle2.drive(0.3, 2900));
            vehicle2.shiftGear(3);
            calculateAverageConsumption.add(vehicle2.drive(0.5, 3300));
            vehicle2.shiftGear(4);
            calculateAverageConsumption.add(vehicle2.drive(50, 3500));
            vehicle2.shiftGear(3);
            calculateAverageConsumption.add(vehicle2.drive(10, 2800));
            vehicle2.shiftGear(4);
            calculateAverageConsumption.add(vehicle2.drive(2.00, 3000));
            vehicle2.shiftGear(5);
            calculateAverageConsumption.add(vehicle2.drive(20.00, 2800));
            vehicle2.stop();

            sum = 0;
            totalAverage = 0;
            for (int i = 0; i < calculateAverageConsumption.size(); i++) {
                sum += calculateAverageConsumption.get(i);
                totalAverage = sum / calculateAverageConsumption.size();
            }
            System.out.println("Average consumption for this trip is: " + df.format(totalAverage));
        }
}
