package stackandqueue;
import javafx.util.Pair;

import java.util.Stack;

class MinStack{
    private Stack<Pair<Integer,Integer>> st;
    MinStack(){
        st = new Stack<>();
    }
    public void push(int val){
        if(st.isEmpty()){
            st.push(new Pair<>(val,val));
        } else {
            int minn = Math.min(st.peek().getValue(),val);
            st.push(new Pair<>(val,minn));
        }
    }
    public void pop(){
        if(!st.isEmpty()){
            st.pop();
        }
    }

    public int top(){
        if(st.isEmpty()){
            return 0;
        } else {
            return st.peek().getKey();
        }
    }
    public int getMin(){
        if(st.isEmpty()){
            return 0;
        } else {
            return st.peek().getValue();
        }
    }
}

public class Solution {
    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
