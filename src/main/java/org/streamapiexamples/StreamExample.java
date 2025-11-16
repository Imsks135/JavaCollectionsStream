package org.streamapiexamples;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 3, 7, 9, 10, 12, 4);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)//2,4,10,12,4
                .map(n -> n * n)//4,16,100,144,64
                .distinct()//4,16,100,144
                .sorted()// 4,16,100,144
                .limit(5)// 4,16,100,144
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Squares of even numbers: " + result);
    }
}