package pointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllTripletsWithZeroSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr.add(element);
        }


        Collections.sort(arr);
        Boolean found = false;
        for(int i=0;i<n-2;i++){
            int start = i+1;
            int end = n-1;
            while (start < end) {
                if (arr.get(i) + arr.get(start) + arr.get(end) == 0) {
                    System.out.println(arr.get(i)+" "+arr.get(start)+" "+arr.get(end));
                    start++;
                    end--;
                    found = true;
                } else if (arr.get(i) + arr.get(start) + arr.get(end) < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        if(found == false){
            System.out.println("No Triplets Found");
        }
    }
}
