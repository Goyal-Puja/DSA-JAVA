package linkedlist;

public class IntersectionOfTwoLL {
    public static int length(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static ListNode intersectionNode(ListNode head1, ListNode head2){
        if(head1 == null || head2 == null)
            return null;

        int len1 = length(head1);
        int len2 = length(head2);

        while(len1 > len2){
            head1 = head1.next;
            len1--;
        }
        while(len1 < len2){
            head2 = head2.next;
            len2--;
        }

        while(head1 != null && head2 != null && head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }
    public static void main(String[] args){
        ListNode commonNode = new ListNode(6);
        commonNode.next = new ListNode(7);
        commonNode.next.next = new ListNode(8);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = commonNode;

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = commonNode;

        IntersectionOfTwoLL intersectionOfTwoLL = new IntersectionOfTwoLL();
        ListNode intersectionValue = intersectionOfTwoLL.intersectionNode(head1,head2);

        if(intersectionValue != null){
            System.out.println("Intersection Node Value :"+intersectionValue.val);
        } else {
            System.out.print("No Intersection found");
        }
    }
}
