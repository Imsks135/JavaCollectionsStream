package org.streamapiexamples;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UniqueElementInArray {
    public static void main(String[] args) {
        // using primitive int[] array
        int[] arr = {1,1,2,3,22,4,5,6,6,7,8};

        System.out.println("First way to print unique elements:");
        int[] unique = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(unique));

        System.out.println("Second way to print unique elements:");
        // boxed converts IntStream → Stream<Integer>
        Stream<Integer> stream = Arrays.stream(arr).boxed().distinct();
        System.out.println(Arrays.toString(stream.toArray()));

        System.out.println("Third way to print unique elements:");
        List<Integer> list = Arrays.stream(arr).boxed().distinct().toList();
        System.out.println(list);

        // Using Object references List
        List<Integer> list1 = Arrays.asList(1,1,2,3,4,4,5,6,7,7,8,9);
        List<Integer> uniqueList = list1.stream().distinct().toList();
        System.out.println("Unique elements in List as:");
        System.out.println(uniqueList);
    }
}
