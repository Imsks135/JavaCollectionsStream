package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartioningByInStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> outputMap = list.stream()
                .collect(Collectors.partitioningBy((Integer x)-> x%2==0));
        //Using entrySet()
        System.out.println("Using entrySet:");
        for(Map.Entry<Boolean,List<Integer>> mp: outputMap.entrySet()){
            System.out.println(mp.getKey()+"-"+mp.getValue());
        }
        //Using keySet()
        System.out.println("Using keySet:");
        for(Boolean ls: outputMap.keySet()){
            System.out.println(ls+"-"+outputMap.get(ls));
        }
    }
}
