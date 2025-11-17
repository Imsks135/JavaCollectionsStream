package org.oops.constructor;

public class ConstructorChaining {
    String name;
    int empId;

    ConstructorChaining() {
        this(10);
    }

    ConstructorChaining(int empId) {
        this("Satyam", empId);
    }

    ConstructorChaining(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
    public void print(){
        System.out.println("The value of name and empId is: "+this.name+" "+ this.empId);
    }
}
