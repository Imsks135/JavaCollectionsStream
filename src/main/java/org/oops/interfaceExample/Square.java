package org.oops.interfaceExample;

public class Square implements Shape{
    double side;
    Square(int side){
        System.out.println("Square constructor is called.");
        this.side = side;
    }
    @Override
    public double area(){
        return side * side;
    }
}
