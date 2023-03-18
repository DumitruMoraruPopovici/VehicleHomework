package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Logan(35, "Diesel", 6, 10d);
        car.availableFuel = 26;
        car.start();
        car.shiftGear(1);
        car.drive(0.01);
        car.shiftGear(2);
        car.drive(0.02);
        car.shiftGear(3);
        car.drive(0.5);
        car.shiftGear(4);
        car.drive(0.5);
        car.shiftGear(4);
        car.drive(0.05);
        car.shiftGear(5);
        car.drive(10);
        car.shiftGear(4);
        car.drive(0.05);
        car.shiftGear(3);
        car.drive(0.1);
        car.stop();
        double availableFuel = car.availableFuel;
        double fuelConsumedPer100Km = car.getAverageFuelConsumption();
        Vehicle vehicle = new Logan(30, "Petrol", 6, 8d);

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car2 = (Car) vehicle;

        double availableFuelCar2 = ((Car) vehicle).availableFuel;

        double fuelConsumedPer100KmCar2 = car.getAverageFuelConsumption();

        Car car3 = new SKlasse(40,"Gasoline", 5, 7d);
        car3.availableFuel = 33;
        Car car4 = new CKlasse(37, "Petrol", 7, 13d);
        car4.availableFuel = 24;

    }
}
