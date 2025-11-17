package org.oops.constructor;

public class MainClass {
    public static void main(String[] args) {
//            PrivateConstructorClass obj = PrivateConstructorClass.getInstance();
        PrivateConstructorClass.getInstance();

        ConstructorChaining obj1 = new ConstructorChaining();
        obj1.print();
    }
}
