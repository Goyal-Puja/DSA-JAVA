package java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindElementsExample {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // findFist() and findAny() method
        Optional<Integer> ele = list.stream().findFirst();
        if(ele.isPresent()){
            System.out.println(ele.get());
        } else {
            System.out.println("Stream is Empty");
        }

        Optional<Integer> ele1 = list.stream().findAny();
        if(ele1.isPresent()){
            System.out.println(ele1.get());
        } else {
            System.out.println("Stream is Empty");
        }

        // count(), min(), max() method
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7 ,8, 9);
        System.out.println("No of elements in a stream " + stream1.count());

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7 ,8, 9);
        Integer min = stream2.min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min ele in a stream "+ min);

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6, 7 ,8, 9);
        Integer max = stream3.max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max ele in a stream "+ max);


    }
}




