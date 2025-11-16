package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByInStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC","ABC","B","C","AB","BC");
        Map<Integer,List<String>> outputMap = list.stream()
                .collect(Collectors.groupingBy((String str)-> str.length()));
        for(Map.Entry<Integer, List<String>> e: outputMap.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
    }
}
