package org.example;

/**
 * Class Car with her properties and behavior
 */
public class Car extends Vehicle{
    final float fuelTankSize = 60;
    final String fuelType = "Diesel";

    final int gears = 6;

    final float consumptionPer100Km = (float) 4.7F;

    public float availableFuel;
    public int tireSize;
    public String chassisNumber;



    /**
     * starting the car with overriding start from vehicle
     */
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    /**
     * method for changing the gear on the car
     * @param gear
     */
    public void shiftGear (int gear) {
        if (gear <= gears) {
            System.out.println("Car is in gear " + gear);
        }
    }

    /**
     * method for the spees of car
     * @param speed
     */
    public void drive (float speed) {
        if (speed > 0) {
            System.out.println("Drives with " + speed + " KMs");
        }
    }

    /**
     * method for stopping the car
     */
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    /**
     * getter and setter for available Fuel
     * @return
     */
    public float getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    /**
     * method for average fuel consumption
     */

    public float getAverageFuelConsumption() {
        float averageFuelConsumption = consumptionPer100Km;
        return averageFuelConsumption;
    }
}
