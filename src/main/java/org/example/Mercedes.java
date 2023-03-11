package org.example;

public class Mercedes extends Car implements Consumption{
    static float consumptionPer100Km = 6.8F;
    public static float setConsumptionPer100Km(int gear, int tireSize) {
        for (int i = 1; i<=gear; i++){
            for (int j=15;j<tireSize;j++){
                consumptionPer100Km = consumptionPer100Km+ consumptionPer100Km/10;
            }
        }
        return consumptionPer100Km;
    }
}
