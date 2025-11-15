package org.collections.comparatorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
           Integer[] a = {3,2,5,6,71,11,23};
           Arrays.sort(a);// default ascending sorting order
           System.out.println("Elements are in ascending order:");
           for(int x:a){
               System.out.println(x);
           }
           Arrays.sort(a,(x,y)-> y-x);// Using comparator
           System.out.println("Elements are in descending order:");
           for(int y:a){
               System.out.println(y);
           }
    }
}
