package org.example;

/**
 * Class Car with her properties and behavior
 */
public abstract class Car implements Vehicle{
    protected final double fuelTankSize;
    protected final String fuelType;

    protected final int maxGears;

    protected final double consumptionPer100Km;

    protected double availableFuel;
    protected int tireSize;
    protected String chassisNumber;
    protected int currentGear;
    protected double averageFuelConsumptionPerDrive;
    protected int totalKm;
    protected double totalFuelConsumed;

    public Car(double fuelTankSize, String fuelType, int maxGears, double consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.maxGears = maxGears;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    /**
     * starting the car with overriding start from vehicle
     */
    @Override
    public void start() {
        System.out.println("Car is starting");
        averageFuelConsumptionPerDrive = 0;
        totalKm = 0;
        totalFuelConsumed = 0;
    }

    /**
     * method for changing the gear on the car
     * @param gear
     */
    public void shiftGear (int gear) {
        if ((gear > maxGears) || (gear < 0)) {
            System.out.println("Invalid gear");
            return;
        }
        calculatedAverageFuelConsumForGear(gear);
        currentGear = gear;
    }

    private void calculatedAverageFuelConsumForGear (int gear) {
        if(this.currentGear < gear) {
            averageFuelConsumptionPerDrive *= (1 + (gear - currentGear) / 10);
        }
        else {
            averageFuelConsumptionPerDrive /= (1 + (currentGear - gear) / 10);
        }
    }

    /**
     * method for the drive with keeping track of fuel and average fuel consumption
     * @param km
     */
    public void drive (double km) {
       double fuelConsumedPerDrive = km * consumptionPer100Km / 100;
       availableFuel -= fuelConsumedPerDrive;
        System.out.println("Remaining fuel is " + availableFuel);
        totalKm +=km;
        totalFuelConsumed +=fuelConsumedPerDrive;
    }
    protected double getAverageFuelConsumption() {
        averageFuelConsumptionPerDrive = totalFuelConsumed * 100/totalKm;
        return averageFuelConsumptionPerDrive;
    }
    /**
     * method for stopping the car
     */
    @Override
    public void stop() {
        System.out.println("Car is stopping");
        System.out.println("Available fuel is " + availableFuel);

    }

}
