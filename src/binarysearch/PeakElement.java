package binarysearch;

public class PeakElement {
    public static int peakElement(int[] arr, int n){
         if(n == 1)                 //base condition - 1
             return 0;
         if(arr[0] > arr[1])           //base condition - 2
             return 0;
         if(arr[n-1] > arr[n-2])       //base condition - 3
             return n-1;

         int start = 0;
         int end = n-1;
         int ans = 0;
         int mid;
         while(start <= end){
             mid = start+(end-start)/2;
             if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                 ans = arr[mid];
                 break;
             } else if(arr[mid] > arr[mid-1]){
                 start = mid+1;
             } else {
                 end = mid-1;
             }
         }
         return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int n = arr.length;
        PeakElement peak = new PeakElement();
        int res = peak.peakElement(arr,n);
        System.out.println("Peak Element is : " + res);
    }
}
