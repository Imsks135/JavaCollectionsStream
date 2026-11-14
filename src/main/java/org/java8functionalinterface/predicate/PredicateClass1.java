package org.java8functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateClass1 implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer >= 10;
    }
}
