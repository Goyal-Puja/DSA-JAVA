package array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > maxx){
                maxx = arr[i];
            }
        }
        int secondMaxx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > secondMaxx && arr[i] != maxx){
                secondMaxx = arr[i];
            }
        }
        System.out.println(secondMaxx);
    }
}
