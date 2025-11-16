package org.collections.setexamples;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetThreadSafe {
    public static void main(String[] args) {
        Set<Integer> set = Collections.synchronizedSet(new LinkedHashSet<>());
        set.add(1);
        set.add(2);
        set.add(3);
        set.forEach(System.out::println);
    }
}
