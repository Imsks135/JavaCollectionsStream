package org.collections.comparatorexample;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample2 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("TOYOTA","BROWN"));
        list.add(new Car("SUZUKI","GREEN"));
        list.add(new Car("HYUNDAI","YELLOW"));
        Collections.sort(list, new CarNameComparator());
        System.out.println("Sorted based on car name");
        list.forEach((Car obj) -> System.out.println(obj.carName + " "+ obj.carType));
    }
}
