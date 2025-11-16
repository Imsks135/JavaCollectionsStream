package org.streamapiexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestInArray {
    public static void main(String[] args) {
        // using array primitive type
        int[] arr = {9,5,3,2,1,2,3,10};
        Optional<Integer> firstHighestInArray = Arrays.stream(arr).boxed().distinct()
                .sorted((x,y)-> y-x).findFirst();
        System.out.println("First highest in array: "+firstHighestInArray.orElse(-1));

        Optional<Integer> secondHighestInArray = Arrays.stream(arr).boxed().distinct().sorted((x, y)-> y-x).skip(1).findFirst();
        System.out.println("Second highest in array: "+ secondHighestInArray.orElse(-1));

        // using List for object and references
        List<Integer> list = Arrays.asList(1,2,10,11,12,13);
        Optional<Integer> firstHighestInList = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("First highest in list: "+ firstHighestInList.orElse(-1));

        Optional<Integer> secondHighestInList = list.stream().distinct().sorted((x, y)->y-x).skip(1).findFirst();
        System.out.println("Second highest in list: "+ secondHighestInList.orElse(-1));
    }
}
