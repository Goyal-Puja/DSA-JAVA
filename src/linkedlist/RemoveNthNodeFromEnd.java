package linkedlist;

public class RemoveNthNodeFromEnd {

    public static int count(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static ListNode removeNthNode(ListNode head,int n){
        int count = count(head);
        int index = count-n;

        ListNode temp = head;

        while(index > 0){
            index--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void print(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+ " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();
        removeNthNodeFromEnd.removeNthNode(head,n);

        removeNthNodeFromEnd.print(head);
    }
}
