package org.oops.abstraction;

public class MainClass {
    public static void main(String[] args) {
        Shape obj1 = new Circle("Red", 7);
        Shape obj2 = new Square("Blue", 2);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        TV obj3 = new TVRemote();
        obj3.TvTurnOff();
        obj3.TvTurnOn();
    }
}
