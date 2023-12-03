package dynamic_programming;

public class LCS {
    public static int LCSUtil(String X,String Y,int m,int n,int[][] dp){
        if(m == 0 || n == 0)
            return 0;
        if(dp[m][n] != -1)
            return dp[m][n];

        if(X.charAt(m-1) == Y.charAt(n-1)){
            return dp[m][n] = 1+LCSUtil(X,Y,m-1,n-1,dp);
        } else {
            return dp[m][n] = Math.max(LCSUtil(X,Y,m-1,n,dp),LCSUtil(X,Y,m,n-1,dp));
        }
    }
    public static void main(String[] args){
        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        int result = LCSUtil(X,Y,m,n,dp);
        System.out.println("Length of LCS : "+result);
    }
}
