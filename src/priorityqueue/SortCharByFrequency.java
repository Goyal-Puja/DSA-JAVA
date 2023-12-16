package priorityqueue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharByFrequency {
    public static String sortCharacterByFrequency(String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> hashMap.get(b) - hashMap.get(a));
        pq.addAll(hashMap.keySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            char ch = pq.remove();
            int count = hashMap.get(ch);
            while(count != 0){
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){

        String str = "tree";
        SortCharByFrequency sortByFrequency = new SortCharByFrequency();
        String result = sortByFrequency.sortCharacterByFrequency(str);
        System.out.println(result);
    }
}
