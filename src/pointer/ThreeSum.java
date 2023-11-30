package pointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr.add(element);
        }
        int target = sc.nextInt();
        Collections.sort(arr);
        int difference = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0;i<n-2;i++){
            int start = i+1;
            int end = n-1;

            while(start < end){
                int sum = arr.get(start)+arr.get(end)+arr.get(i);
                if(Math.abs(target-sum) < difference){
                    difference = Math.abs(target-sum);
                    ans = sum;
                }
                else if(sum < target){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        System.out.println(ans);
    }
}
