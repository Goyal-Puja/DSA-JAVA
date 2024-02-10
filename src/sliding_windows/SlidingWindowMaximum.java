package sliding_windows;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static void main(String[] args){
       // int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] arr = {1, 3, 1, 2, 0, 5};
        int n = arr.length;
        int k = 3;
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans.add(arr[dq.peekFirst()]);
        for(int i=k;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= (i-k)){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.add(i);
            ans.add(arr[dq.peekFirst()]);
        }
        int[] result = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
