package org.example;

public class CKlasse extends Mercedes{
    static float consumptionPer100KmCKlasse = (float) 7.4F;

    public CKlasse (float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;

    }

    public float getAverageFuelConsumption() {
        float averageFuelConsumption = consumptionPer100KmCKlasse;
        return consumptionPer100KmCKlasse;
    }
}
