package java8.streamapi;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondLargestElement {
    // to find the second-largest element in a stream using stream api
    public static void main(String[] args){
        Stream stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> secondLargest = stream.sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if(secondLargest.isPresent()){
            System.out.println(secondLargest.get());
        } else {
            System.out.println("No second largest element found");
        }
    }
}
