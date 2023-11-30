package binarysearch;

import java.util.Scanner;

public class SquareRoot {

    public static int solve(int A){
        if(A  == 0)
            return 0;
        if(A == 1)
           return 1;

        int start = 1;
        int end = A-1;
        int mid;
        int res = 0;

        while(start <= end){
            mid = start+(end-start)/2;
            if(mid*mid == A){
                return mid;
            } else if(mid*mid < A){
                res = mid;
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println(solve(A));
    }
}
