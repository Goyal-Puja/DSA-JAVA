package recursion;

import java.util.Scanner;
import java.util.Stack;

public class ReverseAStack {
    public static void insert(Stack<Integer> st, int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        int temp = st.peek();
        st.pop();
        insert(st,element);
        st.push(temp);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.peek();
        st.pop();
        reverseStack(st);
        insert(st,temp);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t != 0){
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            int element = sc.nextInt();
            st.push(element);
        }
        reverseStack(st);
        while(!st.isEmpty()){
            int temp =st.peek();
            st.pop();
            System.out.print(temp +" ");
        }
        System.out.println();
        t--;
    }
}
}
