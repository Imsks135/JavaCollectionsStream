package org.java8functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierMainClass {
    static void main() {
        Supplier<String> supplier = () -> "Satyam";
        System.out.println(supplier.get());

        Supplier<String> supplier1 = new Supplier<String>() {
            @Override
            public String get() {
                return "Satyam";
            }
        };
        System.out.println(supplier1.get());
        Supplier<String> supplier2 = new SupplierClass1();
        System.out.println(supplier2.get());
    }
}
