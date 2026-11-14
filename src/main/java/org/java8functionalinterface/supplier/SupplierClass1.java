package org.java8functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierClass1 implements Supplier<String> {
    @Override
    public String get() {
        return "Satyam";
    }
}
