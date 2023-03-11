package org.example;

/**
 * subclass Volkswagen
 */
public class Volkswagen extends Car implements Consumption{
    static float consumptionPer100Km = 5.6F;

    /**
     * Method for calculating the consumption based on gear and tyres size
     * @param gear
     * @param tireSize
     * @return
     */
    public static float setConsumptionPer100Km(int gear, int tireSize) {
        for (int i = 1; i<=gear; i++){
            for (int j=15;j<tireSize;j++){
                consumptionPer100Km = consumptionPer100Km+ consumptionPer100Km/10;
            }
        }
        return consumptionPer100Km;
    }
}
