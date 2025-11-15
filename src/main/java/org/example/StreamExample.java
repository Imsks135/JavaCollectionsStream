package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 3, 7, 9, 10, 12, 4);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .distinct()
                .sorted()
                .limit(5)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Squares of even numbers: " + result);
    }
}