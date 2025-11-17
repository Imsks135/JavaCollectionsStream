package org.oops.polymorphism;

import java.sql.SQLOutput;

public class OperatorOverloading {
    public static void main(String[] args) {
        // Java doesn't support operator overloading
        // but have one special case in case of + used for string concatenation
        String s1 ="ABC";
        String s2 ="DEF";
        System.out.println(s1+s2);
        System.out.println(2+3);
        System.out.println("2"+"3");
        System.out.println("sum"+2+3);
        System.out.println("ZBC" + "BCG");
        //internally worked as new StringBuilder().append("ZBC").append("BCG").toString()
    }
}
