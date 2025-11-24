package org.oops.genericclass;

public class GenericClass<T> {
    T val;
    public void setValue(T val){
        this.val = val;
    }

    public  T getVal(){
        return val;
    }
}
