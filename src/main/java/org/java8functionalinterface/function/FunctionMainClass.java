package org.java8functionalinterface.function;

import java.util.function.Function;

public class FunctionMainClass {
    static void main() {
        Function<Integer, Integer> function = i -> i*i;
        System.out.println("The value of integer is: "+ function.apply(5));

        Function<String, Integer> function1 = new Function<>(){
            @Override
            public Integer apply(String str){
                return str.length();
            }
        };
        System.out.println("String length is: "+ function1.apply("Satyam"));
        Function<String, Integer> function2 = new FunctionClass1();
        System.out.println("String length of Satyam is: "+ function2.apply("Satyam"));
    }
}
