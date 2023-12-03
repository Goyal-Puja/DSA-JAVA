package dynamic_programming;
import java.util.Arrays;

public class SubsetSum {
    public static boolean subsetSum(int[] arr, int N, int B, boolean[][] dp) {
        if (B == 0) {
            return dp[N][B] = true;
        }
        if (N == 0) {
            return dp[N][B] = false;
        }

        if (dp[N][B] != false) {
            return dp[N][B];
        }

        if (arr[N - 1] <= B) {
            return dp[N][B] = subsetSum(arr, N - 1, B - arr[N - 1], dp) || subsetSum(arr, N - 1, B, dp);
        } else {
            return dp[N][B] = subsetSum(arr, N - 1, B, dp);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 34, 4, 12, 5, 2};
        int N = arr.length;
        int B = 9;
        boolean[][] dp = new boolean[N + 1][B + 1];
        for (boolean[] row : dp) {
            Arrays.fill(row, false);
        }

        boolean result = subsetSum(arr, N, B, dp);

        if (result == true) {
            System.out.println("Subset with sum " + B + " exists.");
        } else {
            System.out.println("No subset with sum " + B + " exists.");
        }
    }
}
