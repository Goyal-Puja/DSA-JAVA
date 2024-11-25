package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQ {
    private Queue<Integer> q1;
    StackUsingQ(){
        q1= new LinkedList<>();
    }
    public void Push(int x){
        q1.offer(x);
        for(int i=0;i<q1.size()-1;i++){
            q1.offer(q1.poll());
        }
    }
    public void Pop(){
         q1.remove();
    }

     public int top(){
        return q1.peek();
     }

     public boolean isEmpty(){
        return q1.isEmpty();
     }

}

public class StackUsingQueue {
    public static void main(String[] args){
       StackUsingQ s1 = new StackUsingQ();
       s1.Push(2);
       s1.Push(3);
      // s1.Pop();
       System.out.println(s1.top());
       s1.Pop();
       s1.isEmpty();
    }
}
