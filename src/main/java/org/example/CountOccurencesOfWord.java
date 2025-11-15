package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurencesOfWord {
    public static void main(String[] args) {
        // Count occurrences of each word
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");
        Map<String, Long> count = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(count);
    }
}
