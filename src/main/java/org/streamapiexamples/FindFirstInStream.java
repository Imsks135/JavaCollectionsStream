package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstInStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> findFirstElement = list.stream()
                .filter((Integer x)-> x>3).findFirst();// findAny()--> give random value from stream
        System.out.println(findFirstElement.get());
    }
}
