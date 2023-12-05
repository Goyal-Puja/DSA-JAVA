package stackandqueue;
import java.util.Stack;

public class MinimumParentheses {
    public static int count(String str, Stack<Character> st){
        int count = 0;
         int n = str.length();
         for(int i=0;i<n;i++){
             if(str.charAt(i) == '('){
                 st.push(str.charAt(i));
             } else {
                 if(st.isEmpty()){
                     count++;
                 } else if(st.peek() == '('){
                     st.pop();
                 }
             }
         }
         return st.size()+count;
    }
    public static void main(String[] args){
        String str = "(((";
        Stack<Character> st = new Stack<Character>();
        MinimumParentheses result = new MinimumParentheses();
        int minimum = result.count(str,st);
        System.out.println(minimum);
    }
}
