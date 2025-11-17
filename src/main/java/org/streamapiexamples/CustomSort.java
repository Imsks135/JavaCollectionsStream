package org.streamapiexamples;

import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zoe", "Adam", "John", "Eve");

        names.sort((a, b) -> b.compareToIgnoreCase(a));
        System.out.println("Descending Sorted Names: " + names);
    }
}