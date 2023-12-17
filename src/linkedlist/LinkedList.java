package linkedlist;

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
    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.value+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public int length(){
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public boolean search(int element){
        Node curr = head;
        boolean res = false;
        while(curr != null){
            if(curr.value == element){
                res = true;
                break;
            }
            curr = curr.next;
        }
        return res;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.print();
        System.out.println("The length of Linked List "+linkedList.length());
        if(linkedList.search(4)){
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}