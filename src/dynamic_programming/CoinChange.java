package dynamic_programming;

import java.util.Arrays;

public class CoinChange {
    public static int count(int[] coins,int sum,int n,int[][] dp){
        if(sum == 0)
            return dp[n][sum] = 1;

        if(n == 0 || sum < 0)
            return 0;
        if(dp[n][sum] != -1)
            return dp[n][sum];

        return dp[n][sum] = count(coins,sum-coins[n-1],n,dp)+count(coins,sum,n-1,dp);
    }
    public static void main(String[] args){
        int[] coins = new int[]{1,2,3}; // type of coins
        int sum = 5;
        int n = coins.length;
        int[][] dp = new int[n+1][sum+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int res = count(coins,sum,n,dp);
        System.out.println(res);
    }
}

// {1,1,1,1,1} , {1,1,1,2}, {1,1,3}, {2,3}, {1,2,2}