package java8.streamapi;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args){
        // create a stream
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

        // create a stream from source ( source is collection here )
        Collection<String> collections = Arrays.asList("Java", "J2EE", "Spring", "Hibernate");
        Stream<String> stream1 = collections.stream();
        stream1.forEach(System.out::println);

        // (Source is list here)
        List<String> list = Arrays.asList("Java", "J2EE", "Spring", "Hibernate");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream3 = set.stream();
        stream3.forEach(System.out::println);

        String[] strArray = {"a", "b", "c"};
        Stream<String> stream4 = Arrays.stream(strArray);
        stream4.forEach(System.out::println);
    }
}
