package org.collections.comparatorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car1 implements Comparable<Car1> {
    String carName;
    String carType;

    Car1(String x, String y) {
        this.carName = x;
        this.carType = y;
    }

    @Override
    public int compareTo(Car1 o) {
        return this.carName.compareTo(o.carName);
    }
}

public class ComparableExample1 {
    public static void main(String[] args) {
        List<Car1> list = new ArrayList<>();
        list.add(new Car1("INNOVA", "TOYOTA"));
        list.add(new Car1("ALTO", "SUZUKI"));
        list.add(new Car1("TAVERA", "TOYOTA"));
        Collections.sort(list);
        System.out.println("Sorted based on car name:");
        for (Car1 c : list) {
            System.out.println(c.carName + " " + c.carType);
        }
    }
}
