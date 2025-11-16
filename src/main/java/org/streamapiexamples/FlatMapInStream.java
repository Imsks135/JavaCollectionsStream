package org.streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapInStream {
    public static void main(String[] args) {
        List<List<String>> listName = Arrays.asList(
                Arrays.asList("I","am","Satyam"),
                Arrays.asList("My","Home", "is", "in","Varanasi")
        );
//        Stream<String> streamName = listName.stream()
//                .flatMap((List<String> name)-> name.stream());
        Stream<String> streamName = listName.stream()
                .flatMap((List<String>name)-> name.stream().map((String x)->x.toLowerCase()));
        List<String> outputList = streamName.toList();
        System.out.println(outputList);
    }
}
