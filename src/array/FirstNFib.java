package array;

import java.util.Scanner;

public class FirstNFib {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] fib = new int[n];

        fib[1] = 1;
        fib[0] = 1;
        for(int i=2;i<n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        for(int i=0;i<fib.length;i++){
            System.out.print(fib[i]+" ");
        }
    }
}
