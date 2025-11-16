package org.streamapiexamples;

import java.util.List;
import java.util.stream.Stream;

public class FilterInStringUsingPredicateInterface {
    public static void main(String[] args) {
        Stream<String> streamName = Stream.of("SATYAM","RAHUL","SHYAM","RAM","SAM","SUNIL");
        Stream<String> filterNameStream = streamName.filter((String x) -> x.length()==3);
//        long countNameEqualTo3 = filterNameStream.count();
//        System.out.println(countNameGreaterThan3);
        List<String> listName = filterNameStream.toList();
        System.out.println(listName);
    }
}
