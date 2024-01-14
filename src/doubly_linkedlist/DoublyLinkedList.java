package doubly_linkedlist;

import java.util.List;

public class DoublyLinkedList {
    Node head;
    static class Node{
        int value;
        Node prev;
        Node next;

        Node(int d){
            this.value = d;
            this.prev = null;
            this.next = null;
        }
        public void delete(){
            this.value = -1;
        }
    };


    public void insertAtHead(int value){
        Node newNode = new Node(value);
        if(head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }
    public void insertAtTail(int value){
          Node newNode = new Node(value);
          if(head == null){
              head = newNode;
              return;
          }
          Node last = head;
          while(last.next != null){
              last = last.next;
          }
          last.next = newNode;
          newNode.prev = last;
    }
    public void insertAtPosition(int value,int pos){
        if(pos == 1){
            insertAtHead(value);
        }
        Node temp = head;
        int count = 1;
        while(count < pos-1){
            temp = temp.next;
            count++;
        }
        if(temp.next == null){
            insertAtTail(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void deleteNode(int pos){
        if(pos == 1){
            Node temp = head;
            temp = head.next;
            temp.prev = null;
            temp.delete();
            return;
        }
    }

    public void print(Node head){
        while(head != null){
            System.out.print(head.value+" ");
            head = head.next;
        }
    }

    public static void main(String[] args){
         DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

         doublyLinkedList.insertAtHead(3);
         doublyLinkedList.insertAtHead(2);
         doublyLinkedList.insertAtHead(1);

         doublyLinkedList.insertAtTail(4);
         doublyLinkedList.insertAtTail(5);

        // doublyLinkedList.print(doublyLinkedList.head);
         doublyLinkedList.insertAtPosition(6,4);
        //doublyLinkedList.print(doublyLinkedList.head);

        doublyLinkedList.deleteNode(1);
        doublyLinkedList.print(doublyLinkedList.head);
    }
}
