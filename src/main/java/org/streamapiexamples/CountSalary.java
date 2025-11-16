package org.streamapiexamples;

import java.util.ArrayList;
import java.util.List;

public class CountSalary {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(1500);
        list.add(2000);
        list.add(2500);
        list.add(2800);
        long sal = list.stream().filter((Integer x) -> x>1000).count();
        System.out.println("Total number of employees whose salary > 1000 is: "+ sal);

    }
}
