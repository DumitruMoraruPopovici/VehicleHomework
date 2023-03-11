package org.example;

public class VWPassat extends Volkswagen {

    static float consumptionPer100KmVWPassat = (float) 5.8F;

    public VWPassat (float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;

    }

    public float getAverageFuelConsumption() {
        return consumptionPer100KmVWPassat;
    }



}
