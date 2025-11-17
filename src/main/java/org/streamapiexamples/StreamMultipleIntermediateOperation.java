package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMultipleIntermediateOperation {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple","banana",
                "cherry",
                "apple","banana",
                "date","watermelon");
        List<String> result1 = list1.stream()
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase)
                .flatMap(s -> Stream.of(s.split("")))
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .limit(10)
                .skip(2)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Result: "+result1);
    }
}
