// 1 2 3 4 5 --->> 4 5 1 2 3


package array;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        int k = sc.nextInt();

        int[] newArr = new int[n];

        int p = 0;
        for(int i=k+1;i<n;i++){
            newArr[p] = arr[i];
            p++;
        }

        for(int i=0;i<=k;i++){
            newArr[p] = arr[i];
            p++;
        }


        for(int m=0;m<newArr.length;m++) {


            System.out.print(newArr[m]+" ");
        }
    }
}
