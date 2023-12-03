package linkedlist;

public class AddLinkedList {
    public static ListNode reverse(ListNode head){
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
    public static ListNode addTwoLinkedList(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        int carry = 0;
        while(head1 != null || head2 != null || carry != 0){
            int sum = 0;
            if(head1 != null){
                sum = sum+head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                sum = sum+head2.val;
                head2 = head2.next;
            }
            sum = sum+carry;
            carry = sum/10;

            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
         return dummy.next;
    }
    public static void print(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+ " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args){
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(2);

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(5);

        head1 = reverse(head1);
        head2 = reverse(head2);

        AddLinkedList result = new AddLinkedList();
        ListNode ans = result.addTwoLinkedList(head1,head2);
        ans = result.reverse(ans);
        result.print(ans);
    }
}
