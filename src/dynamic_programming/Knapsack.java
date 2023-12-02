package dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Knapsack {
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C,int N){
        int[][] dp = new int[N+1][C+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=C;j++){
                dp[i][j] = -1;
            }
        }
        if(N == 0 || C == 0)
            return 0;

        if(dp[N][C] != -1)
            return dp[N][C];

        if(B.get(N-1) <= C){
            dp[N][C] = Math.max(A.get(N-1)+solve(A,B,C-B.get(N-1),N-1),solve(A,B,C,N-1));
        } else{
           dp[N][C] = solve(A,B,C,N-1);
        }
        return dp[N][C];
    }
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(60,100,120)); // values
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(10,20,30)); // weight
        int C = 50; // capacity
        int N = B.size();
        Knapsack result = new Knapsack();
        System.out.println(result.solve(A,B,C,N));
    }
}