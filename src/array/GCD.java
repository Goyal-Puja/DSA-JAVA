package array;

import java.util.Scanner;

public class GCD {

    private static int GCD(int a,int b){

        if(a == b)
            return a;

        else if(a > b){
            return GCD(a-b,b);
        }
        else if(b > a){
            return GCD(a,b-a);
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = 1;
        for(int i=0;i<n-1;i++){
             result = GCD(arr[i],arr[i+1]);
        }

        System.out.println(result);
    }
}
