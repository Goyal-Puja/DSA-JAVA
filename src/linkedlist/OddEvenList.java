package linkedlist;

public class OddEvenList {
    public static ListNode oddEven(ListNode head){
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public void print(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        OddEvenList list = new OddEvenList();
        ListNode result = list.oddEven(head);
        list.print(result);
    }
}
