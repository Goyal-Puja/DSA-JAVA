package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            int element = sc.nextInt();
            arr.add(element);
        }
        int target = sc.nextInt();

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = arr.get(i);
            int temp = target-x;

            if(hashMap.containsKey(x)){
                ans.add(hashMap.get(x)+1);
                ans.add(i+1);
                break;

            }
            else if(!hashMap.containsKey(temp)){
                hashMap.put(temp,i);
            }

        }
        System.out.print(ans);
    }
}
