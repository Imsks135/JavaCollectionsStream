package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;

public class AnyMatchInStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        boolean valueGreaterthan3 = list.stream().anyMatch((Integer x)-> x>3);
        System.out.println(valueGreaterthan3);
    }
}
