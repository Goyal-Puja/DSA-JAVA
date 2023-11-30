package stackandqueue;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {

    private List<Integer> elements = new ArrayList<>();

    public void PUSH(int data){
        elements.add(data);
    }

    public int POP(){
        if(elements.isEmpty()){
            return -1;
        }
        int top = elements.get(elements.size()-1);
        elements.remove(top);
        return top;
    }

    public int PEEK(){
        if(elements.isEmpty()){
            return -1;
        }

        return elements.get(elements.size()-1);
    }

    public int size(){
        return elements.get(elements.size()-1);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }


    public static void main(String[] args){
        StackUsingArrayList st = new StackUsingArrayList();
        System.out.println(st.isEmpty());
        st.PUSH(1);
        st.PUSH(2);
        st.PUSH(3);
        System.out.println(st.PEEK());
        System.out.println(st.isEmpty());
    }
}
