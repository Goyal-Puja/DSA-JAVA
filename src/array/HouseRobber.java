package array;

public class HouseRobber {
//    public static int houseRobberUtil(int[] arr, int i){  // recursively
//        if(i >= arr.length){
//            return 0;
//        }
//        int robthishouse = arr[i]+houseRobberUtil(arr, i+2);
//        int skipthishouse = houseRobberUtil(arr,i+1);
//
//        return Math.max(robthishouse, skipthishouse);
//    }
    public static void main(String[] args){
        int[] arr = new int[]{2, 7, 9, 3, 1};
        if(arr.length < 0)
            System.out.println(0);

        if(arr.length == 1)
            System.out.println(arr[0]);
        if(arr.length == 2)
            System.out.println(Math.max(arr[0], arr[1]));

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i=2;i<arr.length;i++){
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
        }
       System.out.println(dp[arr.length-1]);
    }
}
