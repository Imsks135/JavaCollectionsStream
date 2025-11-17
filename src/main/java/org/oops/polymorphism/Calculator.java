package org.oops.polymorphism;

public class Calculator {
    Calculator() {
        // default constructor
    }
   // function overloading
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
