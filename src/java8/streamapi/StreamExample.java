package java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 4, 6, 7);
        List<Integer> res = list.stream().filter(n -> n%2 == 0)
                .map(n -> n*n)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
