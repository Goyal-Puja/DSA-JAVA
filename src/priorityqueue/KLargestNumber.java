package priorityqueue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestNumber {
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
        int x = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            pq.offer(arr.get(i));

            if(pq.size() > x)
                pq.poll();
        }
       while(!pq.isEmpty()){
           ans.add(pq.peek());
           pq.poll();
       }
       System.out.print(ans);
    }
}
