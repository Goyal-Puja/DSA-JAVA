package recursion;

import java.util.Scanner;
import java.util.Stack;

public class SortAStack {
    public static Stack<Integer> insert(Stack<Integer> st, int element){
        if(st.empty() || element <= st.peek()){
            st.push(element);
            return st;
        }
        int temp = st.peek();
        st.pop();
        insert(st,element);
        st.push(temp);
        return st;
    }
    public static Stack<Integer> sort(Stack<Integer> st){
        if(st.size() == 1)
            return st;

        int temp = st.peek();
        st.pop();
        sort(st);
        insert(st, temp);
        return st;
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
            sort(st);
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
