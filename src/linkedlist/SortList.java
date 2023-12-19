package linkedlist;

public class SortList {
    public static ListNode sort0s1s2s(ListNode head){
        ListNode curr = head;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        while (curr != null){
            if(curr.val == 0){
                count0++;
            } else if(curr.val == 1){
                count1++;
            } else if(curr.val == 2){
                count2++;
            }
            curr = curr.next;
        }
       curr = head;
        while (curr != null){
            if(count0 > 0){
                curr.val = 0;
                count0--;
            } else if(count1 > 0){
                curr.val = 1;
                count1--;
            } else if(count2 > 0){
                curr.val = 2;
                count2--;
            }
            curr = curr.next;
        }
        return head;
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
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(0);

        SortList list = new SortList();
        ListNode result = list.sort0s1s2s(head);
        list.print(result);
    }
}
