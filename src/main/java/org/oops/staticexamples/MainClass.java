package org.oops.staticexamples;

public class MainClass {
    public static void main(String[] args) {
        StaticMethodClass obj = new StaticMethodClass();
        StaticMethodClass obj1 = new StaticMethodClass();
        System.out.println(obj.print());//allowed but misleading
        System.out.println(obj1.print());//allowed but misleading
        System.out.println(StaticMethodClass.print());// correct way to access static method
    }
}
