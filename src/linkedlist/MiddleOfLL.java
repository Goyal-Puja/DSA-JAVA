package linkedlist;

public class MiddleOfLL {
    public static int middlePoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleOfLL middleOfLL = new MiddleOfLL();
        System.out.println("The middle Node of Linked List is "+ middleOfLL.middlePoint(head));
    }
}
