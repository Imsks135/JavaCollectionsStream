package org.oops.interfaceExample;

public class MainClass {
    public static void main(String[] args) {
          Shape obj1 = new Circle(2);
          Shape obj2 = new Square(3);
          System.out.println("The area of circle is: "+obj1.area());
          System.out.println("The area of square is: "+obj2.area());
    }
}
