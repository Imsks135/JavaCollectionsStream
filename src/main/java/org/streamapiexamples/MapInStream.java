package org.streamapiexamples;

import java.util.List;
import java.util.stream.Stream;

public class MapInStream {
    public static void main(String[] args) {
        // Using function interface
        Stream<String> streamName = Stream.of("Satyam","SHYam","VIVEK","rAhUl");
        Stream<String> mapNameStream = streamName.map((String name) -> name.toLowerCase());
        List<String> listName = mapNameStream.toList();
        System.out.println(listName);
    }
}
