package org.oops.interfaceExample;

public class Circle implements Shape {
    double radius;
    Circle(int r){
        System.out.println("Circle constructor called.");
        this.radius = r;
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }
}
