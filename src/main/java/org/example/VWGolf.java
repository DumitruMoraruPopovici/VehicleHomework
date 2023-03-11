package org.example;

public class VWGolf extends Volkswagen {
     static float consumptionPer100KmVWGolf = (float) 6.4F;

    public VWGolf (float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;

    }

    public float getAverageFuelConsumption() {
        float averageFuelConsumption = consumptionPer100KmVWGolf;
        return consumptionPer100KmVWGolf;
    }


}
