package org.example;

public class SKlasse extends Mercedes {
    static float consumptionPer100KmSKlasse = 7.4F;

    public SKlasse (float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;

    }

    public float getAverageFuelConsumption() {
        float averageFuelConsumption = consumptionPer100KmSKlasse;
        return consumptionPer100KmSKlasse;
    }
}
