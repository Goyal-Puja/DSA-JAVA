package stackandqueue;

public class Stack {
    int size = 1000;
    int[] arr = new int[size];
    int top = -1;

    void PUSH(int data){
        top++;
        arr[top] = data;
    }

    int POP(){
        int x = arr[top];
        top--;
        return x;
    }


    int size(){
        return top+1;
    }

     public static void main(String[] args){

        Stack st = new Stack();
        st.PUSH(1);
        st.PUSH(2);
        st.PUSH(3);
        System.out.println(st.size());
        st.POP();
        System.out.println(st.size());

     }
}
