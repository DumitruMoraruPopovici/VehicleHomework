package org.example;

/**
 * subclass Volkswagen
 */
public abstract class Volkswagen extends Car {
    public Volkswagen(double fuelTankSize, String fuelType, int maxGears, double consumptionPer100Km) {
        super(fuelTankSize, fuelType, maxGears, consumptionPer100Km);
    }
}
