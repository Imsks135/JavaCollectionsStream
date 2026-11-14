package org.java8functionalinterface.function;

import java.util.function.Function;

public class FunctionClass1 implements Function<String, Integer> {
    @Override
    public Integer apply(String str){
        return str.length();
    }
}
