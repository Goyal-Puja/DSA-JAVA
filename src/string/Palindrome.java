package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = 0;
        int j = str.length()-1;

        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else {
                break;
            }
        }
        if( i >= j){
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

    }
}
