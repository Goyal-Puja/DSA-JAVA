package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int pre = Integer.MIN_VALUE;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],i);
            }
            else{
                pre = Math.max(pre,hashMap.size());
                i = hashMap.get(arr[i]);
                hashMap.clear();
            }
        }
        System.out.println(pre);
    }
}
