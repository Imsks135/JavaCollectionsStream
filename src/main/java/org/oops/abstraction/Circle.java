package org.oops.abstraction;

public class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called.");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "The area of circle is "+ area()+" and color is "+ super.getColor();
    }
}
