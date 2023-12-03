package linkedlist;

public class PalindromeLinkedList {
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
    public static int isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;

        while(slow != null){
            if(slow.val != head.val){
                return 0;
            }
            slow = slow.next;
            head = head.next;
        }
        return 1;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeLinkedList result = new PalindromeLinkedList();
        int ans = result.isPalindrome(head);
        if(ans == 1){
            System.out.println("Given LinkedList is Palindrome");
        } else{
            System.out.println("Given LinkedList is not Palindrome");
        }
    }
}
