package org.oops.abstraction;

public class Square extends Shape {
    int side;

    Square(String color, int side) {
        super(color);
        System.out.println("Square Constructor called.");
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "The area of Square is "+ area()+" and the color is "+super.getColor();
    }
}
