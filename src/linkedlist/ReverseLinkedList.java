package linkedlist;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static ListNode reverse(ListNode head){
        if(head == null)
            return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ReverseLinkedList result = new ReverseLinkedList();
        ListNode reverseHead = result.reverse(head);
        ListNode curr = reverseHead;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
}
