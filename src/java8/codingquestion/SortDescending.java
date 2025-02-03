package java8.codingquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 10);
        List<Integer> sortedList = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
