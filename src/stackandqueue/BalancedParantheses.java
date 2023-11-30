package stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args){

        String str = "((()))";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(st.isEmpty()){
                st.push(str.charAt(i));
            } else if(str.charAt(i) == ')' && st.peek() == '('){
                st.pop();
            } else if(str.charAt(i) == '(' && st.peek() == '('){
                st.push(str.charAt(i));
            }
        }

        if(st.isEmpty()){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
