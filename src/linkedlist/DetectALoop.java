package linkedlist;

import javax.swing.*;

public class DetectALoop {
    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static ListNode startingPoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static int lengthOfLoop(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int count = 1;
                slow = slow.next;
                while(slow != fast){
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;  // creating a loop

        DetectALoop loop = new DetectALoop();
        if (loop.hasCycle(node1) == true){
            System.out.println("Loop detected in the linked list");
        } else {
            System.out.println("No loop detected in the linked list");
        }
        System.out.println("The starting point of the loop : "+ loop.startingPoint(node1));
        System.out.println("The length of loop : "+ loop.lengthOfLoop(node1));
    }
}
