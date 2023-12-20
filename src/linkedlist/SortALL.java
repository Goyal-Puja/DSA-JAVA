package linkedlist;

public class SortALL {
    public static ListNode middleList(ListNode head){
        if(head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null){
            prev.next = null;
        }
        return slow;
    }
    public static ListNode mergeList(ListNode first, ListNode second){
        if(first == null)
            return second;
        if(second == null)
            return first;

        ListNode third;

        if(first.val <= second.val){
            third = first;
            third.next = mergeList(first.next,second);
        } else {
            third = second;
            third.next = mergeList(first,second.next);
        }
        return third;
    }
    public static ListNode merge(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode middle = middleList(head);
        ListNode first = merge(head);
        ListNode second = merge(middle);
        ListNode result = mergeList(first, second);
        return result;
    }
    public static void print(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(1);

        SortALL sortALL = new SortALL();
        sortALL.merge(head);

        sortALL.print(head);
    }
}
