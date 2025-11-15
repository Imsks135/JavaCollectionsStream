package org.collections.comparatorexample;

import java.util.Arrays;

class Car {
    String carName;
    String carType;
    Car(String x, String y) {
        this.carName = x;
        this.carType = y;
    }
}

public class ComparatorExample1 {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car("MAHINDRA", "BLACK");
        carArray[1] = new Car("TATA","RED");
        carArray[2] = new Car("FORD","GREY");// Comparator using lambda expressions
        Arrays.sort(carArray, (Car obj1, Car obj2)-> obj1.carType.compareTo(obj2.carType));
        System.out.println("Sorted based on car type:");
        for( Car c: carArray){
            System.out.println(c.carName+ " "+ c.carType);
        }
        Arrays.sort(carArray, (Car obj1, Car obj2)-> obj1.carName.compareTo(obj2.carName));
        System.out.println("Sorted based on car name:");
        for( Car c: carArray){
            System.out.println(c.carName+ " "+ c.carType);
        }
    }
}
