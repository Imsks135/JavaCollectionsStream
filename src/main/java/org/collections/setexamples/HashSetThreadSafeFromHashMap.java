package org.collections.setexamples;


import java.util.*;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashSetThreadSafeFromHashMap {
    public static void main(String[] args) {
        Set<Integer> st = Collections.newSetFromMap(new ConcurrentHashMap<>());// Thread safe set
        st.add(1);
        st.add(2);
        st.add(3);
        for (Integer integer : st) {
            System.out.println(integer);
        }
    }
}
