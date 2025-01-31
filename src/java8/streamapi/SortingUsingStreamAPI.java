package java8.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStreamAPI {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

       // There are three ways to arrange the list in ascending order

       List<String> list =  fruits.stream().sorted((Comparator.naturalOrder())).collect(Collectors.toList());
       System.out.println(list);

        List<String> sortedList = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList()); // using lambda expression
        System.out.println(sortedList);

        List<String> sortedList1 = fruits.stream().sorted().collect(Collectors.toList()); // without any parameters, by default it will sort the
                                                                                                     // list in ascending order
        System.out.println(sortedList1);


        //descending order

        List<String> descList = fruits.stream().sorted((Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(descList);

        List<String> descList1 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList()); // using lambda expression
        System.out.println(descList1);

    }
}
