package binarysearch;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchForRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the value into sorted array : ");
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            arr.add(value);
        }
        System.out.println("Enter the element to be searched : ");
        int element = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>(2);
        ans.add(-1);
        ans.add(-1);

        int start = 0;
        int end = arr.size()-1;
        int mid;
        while(start <= end){
            mid = start+(end-start)/2;
            if(arr.get(mid) == element){
                ans.set(0,mid);
                end = mid-1;
            } else if(arr.get(mid) < element){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        start = arr.get(0);
        end = arr.size()-1;
        while (start <= end){
            mid = start+(end-start)/2;
            if(arr.get(mid) == element){
                ans.set(1,mid);
                start = mid+1;
            } else if(arr.get(mid) < element){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        System.out.println(ans);
    }
}
