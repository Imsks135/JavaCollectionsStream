package org.oops.abstraction;

public class TVRemote extends  TV{

    TVRemote(){
        System.out.println("TVRemote constructor called.");
    }
    @Override
    void TvTurnOn() {
        System.out.println("TV is turned on.");
    }

    @Override
    void TvTurnOff() {
        System.out.println("TV is turned off.");
    }
}
