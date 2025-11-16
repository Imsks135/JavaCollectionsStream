package org.streamapiexamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        String str = "banana";
        Map<String, Long> frequency = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Frequency: " + frequency);
    }
}