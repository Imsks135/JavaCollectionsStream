package org.oops.constructor;

public class PrivateConstructorClass {

    private PrivateConstructorClass(){
        System.out.println("Private Constructor.");
    }
    public static PrivateConstructorClass getInstance(){
        return new PrivateConstructorClass();
    }
}
