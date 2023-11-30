package array;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //1
        int b = sc.nextInt();  //2

        a = a+b;  //3
        b = a-b;  //3-2 = 1;
        a = a-b; // 3-1 = 2;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
