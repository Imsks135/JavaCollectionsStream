package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeekInStream {
    public static void main(String[] args) {
        // Using Consumer Interface peek() method used
        List<Integer> list = Arrays.asList(1,2,3,4,6,7);
        Stream<Integer> numberStream = list.stream().filter((Integer x)-> x>3) //4,5,6,7
                .peek((Integer y) -> System.out.println(y)).map((Integer z)-> 2*z);
        List<Integer> outputList = numberStream.toList();
        System.out.println(outputList);
    }
}
