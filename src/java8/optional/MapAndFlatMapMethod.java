package java8.optional;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapMethod {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Hello", "World");
        List<String[]> mappedWords = words.stream()
                .map(word -> word.split("")) // map is used to transform each element in a stream and
                                                  // returns a stream of the same size
                .collect(Collectors.toList());

        mappedWords.forEach(arr -> System.out.println(Arrays.toString(arr)));

        List<String> flatMappedWords = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        flatMappedWords.forEach(arr -> System.out.println(arr));
    }
}
