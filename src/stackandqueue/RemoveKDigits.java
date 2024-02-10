package stackandqueue;

import java.util.Stack;

public class RemoveKDigits {
    public static String removeKDigits(String num,int k){
        if(k == num.length())
            return "0";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(k > 0 && !st.empty() && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        while (k > 0){
            st.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        while(!st.empty()){
            result.append(st.peek());
            st.pop();
        }

        String ans = result.reverse().toString();
        int i = 0;
        while(i < ans.length() && ans.charAt(i) == '0'){
            i++;
        }
        ans = ans.substring(i, ans.length());
        return ans;
    }
    public static void main(String[] args){
        String num = "1432219";
        int k = 3;
        System.out.println(removeKDigits(num,k));
    }
}
