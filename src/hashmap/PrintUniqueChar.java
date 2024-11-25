package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintUniqueChar {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();

       Map<Character,Integer> map = new HashMap<>();
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }
           else if(!map.containsKey(ch)){
               map.put(ch,1);
           }
       }
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
           if(entry.getValue() == 1){
               System.out.println(entry.getKey());
           }
       }
   }
}
