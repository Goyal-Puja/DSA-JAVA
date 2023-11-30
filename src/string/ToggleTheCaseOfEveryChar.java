package string;

import java.util.Scanner;

public class ToggleTheCaseOfEveryChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer("");

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                stringBuffer.append(Character.toLowerCase(ch));
            }
            else if(ch >= 'a' && ch <= 'z'){
                stringBuffer.append(Character.toUpperCase(ch));
            }
            else{
                stringBuffer.append(ch);
            }
        }
        String res = stringBuffer.toString();
        System.out.println(res);
    }
}
