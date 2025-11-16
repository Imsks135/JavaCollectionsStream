package org.streamapiexamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToIntStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3");
        IntStream listStream = list.stream().mapToInt((String str)-> Integer.parseInt(str));
//        List<Integer> outputList = list.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
        List<Integer> outputList = listStream.boxed().collect(Collectors.toList());
        System.out.println(outputList);

        int[] arr = {1,2,3,4,5};
        IntStream arrStream = Arrays.stream(arr).filter((int x)-> x>2);
        int[] outputArray = arrStream.toArray();
        System.out.println(Arrays.toString(outputArray));
    }
}
