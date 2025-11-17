package org.oops.constructor;

public class SuperConstructorExample {
    public static void main(String[] args) {
        Person obj1 = new Manager();// You are inside Person No args constructor.You are inside Manager no args constructor.
        Manager obj2 = new Manager();// You are inside Person No args constructor.You are inside Manager no args constructor.
        Person obj3 = new Person();// You are inside Person No args constructor.
    }
}
