package string;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s1, String s2){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            hashMap.put(s1.charAt(i),hashMap.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            if(hashMap.get(s2.charAt(i)) != null){
                if(hashMap.get(s2.charAt(i)) == 1){
                    hashMap.remove(s2.charAt(i));
                } else {
                    hashMap.put(s2.charAt(i), s2.charAt(i)-1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "anagram";
        String s2 = "nagaram";

        ValidAnagram validAnagram = new ValidAnagram();
        if(validAnagram.isAnagram(s1,s2)){
            System.out.println("Both the strings are anagram");
        } else {
            System.out.println("Both the strings are not anagram");
        }
    }
}
