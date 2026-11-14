package org.java8functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerMainClass {
    static void main() {
        Consumer<Integer> consumer = i -> System.out.println("The value of i is : "+ i);
        consumer.accept(2);

        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("The value of string s is : "+ s);
            }
        };
        consumer1.accept("Satya");

        Consumer<String> consumer2 = new ConsumerClass1();
        consumer2.accept("Satya");
    }
}
