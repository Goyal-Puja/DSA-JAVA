package priorityqueue;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopKFrequent {
    public static void main(String[] args){
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hashMap.get(b) - hashMap.get(a));
        pq.addAll(hashMap.keySet());

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll();
        }

        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
