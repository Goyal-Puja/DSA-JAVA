package priorityqueue;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }

        while(k > 1){
            pq.poll();
            k--;
        }
        System.out.println(pq.peek());
    }
}
