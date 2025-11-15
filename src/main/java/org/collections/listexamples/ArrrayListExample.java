package org.collections.listexamples;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ArrrayListExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(7);
        list1.add(5);
        list1.add(3);
        System.out.println("List elements are: ");
        for(Integer x:list1){
            System.out.println(x);
        }
        System.out.println("Max:"+Collections.max(list1));
        System.out.println("Min:"+Collections.min(list1));
        Collections.sort(list1);
//        Collections.sort(list1,Collections.reverseOrder());
        list1.forEach(System.out::println);
        System.out.println("Size:"+ list1.size());
        System.out.println("IsEmpty:"+ list1.isEmpty());
        System.out.println("Contains:" + list1.contains(10));
        list1.remove(0);
        System.out.println("List elements are: ");
        for(Integer x:list1){
            System.out.println(x);
        }
        list1.remove(Integer.valueOf(7));
        System.out.println("List elements are: ");
        for(Integer x:list1){
            System.out.println(x);
        }
        Stack<Integer> st = new Stack<>();
        st.add(11);
        st.add(17);
        list1.addAll(st);
        System.out.println("List elements are: ");
        for(Integer x:list1){
            System.out.println(x);
        }
        System.out.println(list1.containsAll(st));
        list1.remove(Integer.valueOf(17));
        System.out.println(list1.containsAll(st));
        list1.clear();
        System.out.println(list1.isEmpty());
    }
}
