package org.oops.polymorphism;

public class MainClass {
    public static void main(String[] args) {
        // Overloading Example static binding/Early binding
        Calculator obj = new Calculator();
        System.out.println("Sum of 2 + 3 = "+ obj.add(2,3));// Compile time polymorphism
        System.out.println("Sum of 2 + 3 + 4 = "+ obj.add(2,3,4));

        // Overriding Example Dynamic binding/Late binding
        InterfaceCalculator obj1 = new ClassCalculator();
        System.out.println("Subtraction of 3 - 2 = "+ obj1.subtr̥act(3,2));// Runtime polymorphism
        System.out.println("Multiplication of 3 * 2 = "+ obj1.multiple(3,2));
    }
}
