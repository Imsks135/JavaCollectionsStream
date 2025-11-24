package org.oops.genericclass;

public class Main {
    public static void main(String[] args) {
        Print obj1 = new Print();
        obj1.setValue(2);
        Object obj2 = obj1.getValue();
        System.out.println("Value is: "+(int)obj2);//type casting

        GenericClass<Integer> genericObj = new GenericClass<Integer>();
        genericObj.setValue(3);
        Integer value = genericObj.getVal();// here no typeCasting using generic class object
        System.out.println("Value is: "+ value);
    }
}
