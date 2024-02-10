package dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class CuttingARod {
//    public static int cutRod(int[] arr,int index,int n,int[][] dp){
//        if(index == 0){
//            return n*arr[0];
//        }
//        if(dp[index][n] != -1){
//            return dp[index][n];
//        }
//
//
//    }
    public static void main(String[] args){
        int[] arr = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        int n = arr.length;
        int[][] dp = new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
    }
}
