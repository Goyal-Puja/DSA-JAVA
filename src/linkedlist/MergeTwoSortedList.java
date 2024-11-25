package linkedlist;


import java.util.List;

class ListNodee{
    int data;
    ListNodee next;

    ListNodee(int data){
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedList {

     public static ListNodee merge(ListNodee head1, ListNodee head2){
         ListNodee dummy = new ListNodee(0);
         ListNodee curr = dummy;
         while(head1 != null && head2 != null){
             if(head1.data <= head2.data){
                 curr.next = head1;
                 head1 = head1.next;
             } else {
                 curr.next = head2;
                 head2 = head2.next;

             }
             curr = curr.next;
         }
         if(head1 != null){
             curr.next = head1;
         } else {
             curr.next = head2;
         }
         return dummy.next;
     }
     public static void display(ListNodee head){
         ListNodee curr = head;
         while(curr != null){
             System.out.print(curr.data+" ");
             curr = curr.next;
         }
     }

    public static void main(String[] args){

        ListNodee head1 = new ListNodee(1);
        head1.next = new ListNodee(2);
        head1.next.next = new ListNodee(6);

        ListNodee head2 = new ListNodee(3);
        head2.next = new ListNodee(4);
        head2.next.next = new ListNodee(5);

        ListNodee mergeList = merge(head1,head2);
        display(mergeList);
    }
}
