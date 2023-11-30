package array;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAndMissingNumber {
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

        ArrayList<Integer> ans = new ArrayList<>(2);
        boolean vis[] = new boolean[arr.size()+1];
        for(int i=0;i<arr.size();i++){
            if(!vis[arr.get(i)]){
                vis[arr.get(i)] = true;
            }
            else{
                ans.add(arr.get(i));
            }
        }
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                ans.add(i);
            }
        }
       System.out.println("Repeated Element : "+ ans);
    }
}
