package linkedlist;

public class Solution {

    Node head;
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertAtGivenPosition(int data, int position){
        if(position == 0){
            insertAtBegin(data);
        }
        Node newNode = new Node(data);
        Node curr = head;
        for(int i=0;i<position-1 && curr != null;i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void main(String[] args){
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);

    }

}
