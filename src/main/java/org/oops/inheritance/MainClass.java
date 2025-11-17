package org.oops.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();// Car obj1 = new Car();
        Vehicle obj2 = new Bike();// Bike obj2 = new Bike();
        obj1.drive();
        obj2.drive();
    }
}
