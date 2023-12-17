package linkedlist;

import java.util.List;

public class DeleteANode {
    public static void delete(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
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

        DeleteANode deleteANode = new DeleteANode();
        deleteANode.delete(head.next.next);

        deleteANode.print(head);
    }
}
