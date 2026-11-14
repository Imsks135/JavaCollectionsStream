package org.java8functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateMainClass {
    static void main() {
        Predicate<Integer> predicate = i -> i>=10;
        System.out.println(predicate.test(10));

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 10;
            }
        };
        System.out.println(predicate1.test(10));

        Predicate<Integer> predicate2 = new PredicateClass1();
        System.out.println(predicate2.test(10));
    }
}
