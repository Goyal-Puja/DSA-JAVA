package linkedlist;
import java.util.*;

public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        return head;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        Node dummy = new Node(0);
        Node temp = dummy;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum = sum + l1.value;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.value;
                l2 = l2.next;
            }

            sum = sum + carry;
            carry = sum / 10;
            Node node = new Node(sum % 10);

            temp.next = node;
            temp = temp.next;
        }
        return reverse(dummy.next);
    }

    public int isPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;

        while(slow != null){
           if(slow.value != head.value){
               return 0;
           }
           slow = slow.next;
           head = head.next;
        }
        return 1;
    }

    public Node removeDuplicates(Node head){

        Node curr = head;

        while(curr.next != null && curr != null){
            if(curr.value == curr.next.value){
                curr.next = curr.next.next;

            }
            else
                curr = curr.next;
        }

        return head;
    }


    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(1);
        LinkedList l2 = new LinkedList();
        l2.append(1);
        l2.append(1);
        l2.append(1);

        LinkedList removeDup = new LinkedList();
        Node newL1 = removeDup.removeDuplicates(l1.head);


//        System.out.println("remove duplicates"+l1.removeDuplicates(l1.head));
//
//        if(l1.isPalindrome(l1.head) == 1){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not");
//        }
//
//        LinkedList result = new LinkedList();
//        Node sum = result.addTwoNumbers(l1.head, l2.head);

        while (newL1 != null){
            System.out.print(newL1.value+"->");
            newL1 = newL1.next;
        }
    }
}