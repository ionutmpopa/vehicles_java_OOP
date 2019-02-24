package com.iopo;

public class Main {

    public static void main(String[] args) {

    	Car vehicle1 = new CKlasse("123456789", 45);

    	vehicle1.start();
    	vehicle1.shiftGear(1);
    	vehicle1.drive(0.1, 2800);
    	vehicle1.shiftGear(2);
        vehicle1.drive(0.3, 2900);
        vehicle1.shiftGear(3);
        vehicle1.drive(0.5, 3300);
        vehicle1.shiftGear(4);
        vehicle1.drive(50, 3500);
        vehicle1.shiftGear(3);
        vehicle1.drive(10, 2800);
        vehicle1.shiftGear(4);
        vehicle1.drive(2.00, 3000);
        vehicle1.shiftGear(5);
        vehicle1.drive(20.00, 2800);
    	vehicle1.stop();

        System.out.println("##########################################");
        Car vehicle2 = new SKlasse("1334323456", 40);

        vehicle2.start();
        vehicle2.shiftGear(1);
        vehicle2.drive(0.1, 2800);
        vehicle2.shiftGear(2);
        vehicle2.drive(0.3, 2900);
        vehicle2.shiftGear(3);
        vehicle2.drive(0.5, 3300);
        vehicle2.shiftGear(4);
        vehicle2.drive(50, 3500);
        vehicle2.shiftGear(3);
        vehicle2.drive(10, 2800);
        vehicle2.shiftGear(4);
        vehicle2.drive(2.00, 3000);
        vehicle2.shiftGear(5);
        vehicle2.drive(20.00, 2800);
        vehicle2.stop();

    }
}
