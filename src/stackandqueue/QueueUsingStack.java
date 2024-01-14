package stackandqueue;
import java.util.Stack;
public class QueueUsingStack {
    private Stack<Integer> stack;
    public QueueUsingStack(){
        stack = new Stack<>();
    }
    public void enqueue(int item){
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int temp = stack.pop();
        enqueue(item);
        stack.push(temp);
    }
    public int size(){
        return stack.size();
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return stack.pop();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public static void main(String[] args){
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);
        queueUsingStack.enqueue(3);

        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        queueUsingStack.enqueue(4);

        int n = queueUsingStack.size();

       System.out.println(n);
    }
}
