package org.oops.polymorphism;

public class ClassCalculator implements InterfaceCalculator{
    @Override
    public int subtr̥act(int a,int b) {
        return  a-b;
    }

    @Override
    public int multiple(int a,int b) {
        return a*b;
    }
}
