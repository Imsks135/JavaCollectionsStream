package org.collections.comparatorexample;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {

    @Override
    public int compare(Car obj1, Car obj2) {
        return obj1.carName.compareTo(obj2.carName);
    }
}
