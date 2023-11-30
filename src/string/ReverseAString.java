package string;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer stringBuffer = new StringBuffer();
        //string buffer is synchronized, it is a thread safe it means we can't call thread method simultaneously
        for(int i=str.length()-1;i>=0;i--){
            stringBuffer.append(str.charAt(i));
        }

                System.out.println(stringBuffer);

    }
}
