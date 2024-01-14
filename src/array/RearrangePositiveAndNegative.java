package array;

import java.util.Scanner;

public class RearrangePositiveAndNegative {
    public static void main(String[] args){
        int[] arr = new int[]{1, -2, 5, -6, -9, 2};
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
