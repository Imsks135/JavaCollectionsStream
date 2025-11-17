package org.oops.inheritance;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
    @Override
    public void speed() {
        System.out.println("Car is speeding.");
    }
}
