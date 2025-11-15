package org.collections.setexamples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>((a,b) -> b-a);
        st.add(8);
        st.add(1);
        st.add(10);
//        for(Integer x:st){
//            System.out.println(x);
//        }
        st.forEach(System.out::println);
    }
}
