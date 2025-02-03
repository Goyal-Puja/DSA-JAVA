package java8.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramChecker {
    public static void main(String[] args){
          String str1 = "listen";
          String str2 = "silent";

          System.out.println("Are they anagram : " + isAnagrams(str1, str2));
    }

    public static boolean isAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        return Arrays.stream(str1.split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Arrays.stream(str2.split(""))
                .sorted()
                .collect(Collectors.joining()));
    }
}
