package org.example;

public class Vehicle {

    String name ;

    public Vehicle () {

    }

    public void start () {
        System.out.println("Vehicle is starting");
    }

    public void stop () {
        System.out.println("Vehicle is stopping");
    }

    public void drive (int speed) {
        if (speed > 0 ) {
            System.out.println("Vehicle is driving");
        }
    }
}
