package java8.codingquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseConversion {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Java", "Python", "C++", "Golang");
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseNames);
    }
}
