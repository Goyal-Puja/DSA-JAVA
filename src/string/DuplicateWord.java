package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args){
        String str = "Puja is puja gou goyal gou";
        String[] words = str.split("//s+");
        HashMap<String, Integer> hmap = new HashMap<>();

        for(String word : words){
            word = word.toLowerCase();
            hmap.put(word, hmap.getOrDefault(word, 0)+1);
        }

        for(Map.Entry<String, Integer> word : hmap.entrySet()){
            if(hmap.get(word) > 1){
                System.out.println(word);
            }
        }
    }
}
