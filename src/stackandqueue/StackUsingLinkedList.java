package stackandqueue;

public class StackUsingLinkedList {
    private class Node{
        int data;
        Node link;
    }
    Node top;
    public StackUsingLinkedList(){
        this.top = null;
    }

    public void PUSH(int x){
        Node temp = new Node();
        if(temp == null){
            System.out.println("Overflow");
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void POP(){
        if(top == null){
            System.out.println("UnderFlow");
        }
        top = top.link;
    }

    public void display(){
        if(top == null){
            System.out.println("Underflow");
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.link;
            if(temp != null){
                System.out.print("---->");
            }
        }
    }
    public static void main(String[] args){
        StackUsingLinkedList st = new StackUsingLinkedList();
        st.PUSH(1);
        st.PUSH(2);
        st.PUSH(3);
        st.display();
        System.out.println();
        st.POP();
        st.display();
    }
}
