package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Logan(27, "oiqe0934hkkadsn");
        car.start();
        car.shiftGear(1);
        car.drive((float) 0.01F);
        car.shiftGear(2);
        car.drive(0.02F);
        car.shiftGear(3);
        car.drive(0.5F);
        car.shiftGear(4);
        car.drive(0.5F);
        car.shiftGear(4);
        car.drive(0.05F);
        car.shiftGear(5);
        car.drive(10F);
        car.shiftGear(4);
        car.drive(0.05F);
        car.shiftGear(3);
        car.drive(0.1F);
        car.stop();
        float availableFuel = car.getAvailableFuel();
        System.out.println(availableFuel);
        float fuelConsumedPer100Km = car.getAverageFuelConsumption();
        System.out.println(fuelConsumedPer100Km);
        float consumptionPer100KmVWGolf = VWGolf.setConsumptionPer100Km(2,16);
        System.out.println("Consumption for VWGolf is: " + consumptionPer100KmVWGolf);
        float consumptionPer100KmVWPassat = VWPassat.setConsumptionPer100Km(2,16);
        System.out.println("Consumption for VWPassat is: " + consumptionPer100KmVWPassat);

        Car car2 = new SKlasse(40,"234876hgfguyqew23");
        Car car3 = new CKlasse(37, "dasfdas987986dafs");
        car3.getAverageFuelConsumption();
        System.out.println(car3.getAverageFuelConsumption());
        System.out.println(car3.getAvailableFuel());

    }
}
