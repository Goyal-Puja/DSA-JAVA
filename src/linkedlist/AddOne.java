package linkedlist;

public class AddOne {
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
    public static ListNode addOneToLL(ListNode head){
        ListNode head1 = reverse(head);
        ListNode curr = head1;
        while(curr != null){
            if(curr.val + 1 <= 9){
                curr.val = curr.val+1;
                break;
            } else {
                curr.val = 0;
                if(curr.next != null){
                    curr.next = new ListNode(1);
                    break;
                }
              curr = curr.next;
            }
        }
         return reverse(head1);
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
        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(9);

        AddOne addOne = new AddOne();
        ListNode result = addOne.addOneToLL(head);
        addOne.print(result);
    }
}
