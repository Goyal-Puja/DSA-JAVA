package array;

public class MoveZeroToEnd {
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 3, 2, 4, 0, 9};
        int n = arr.length;
        int k = 0;

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[k++] = arr[i];
            }
        }

        while(k < n){
            arr[k++] = 0;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
