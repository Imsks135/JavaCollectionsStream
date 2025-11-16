package org.streamapiexamples;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "three", "five", "seven", "eleven", "ten");

        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

        grouped.forEach((length, group) ->
                System.out.println("Length " + length + ": " + group));
    }
}