package org.oops.abstraction;

abstract class Shape {
    String color;

    // Abstract class Constructor
    Shape(String color) {
        System.out.println("Shape abstract class constructor called.");
        this.color = color;
    }

    // abstract methods
    abstract double area();
    public abstract String toString();

    // concrete method
    public String getColor() {
        return color;
    }
}
