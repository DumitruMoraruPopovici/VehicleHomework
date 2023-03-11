package org.example;

public class Logan extends Dacia{

    public Logan (float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;

    }

    @Override
    public void setAvailableFuel(float availableFuel) {
        super.setAvailableFuel(availableFuel);
    }
}
