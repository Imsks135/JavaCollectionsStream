package org.oops.inheritance;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving.");
    }

    @Override
    public void speed() {
        System.out.println("Bike is speeding.");
    }
}
