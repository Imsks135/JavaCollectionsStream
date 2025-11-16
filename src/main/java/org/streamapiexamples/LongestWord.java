package org.streamapiexamples;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        // Find the longest word in a sentence
        String sentence = "Java is a powerful programming language";
        String longest = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest word: " + longest);
    }
}
