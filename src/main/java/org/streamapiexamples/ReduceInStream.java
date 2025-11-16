package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceInStream {
    public static void main(String[] args) {
        // Associative aggregation
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> reduceValue = list.stream().reduce((Integer x1, Integer x2)-> x1+x2);
        System.out.println("Reduced vaue: "+ reduceValue.get());//1+2+3+4+5
    }
}
