package linkedlist;

public class DeleteKthNode {
    public static ListNode removeKthNode(ListNode head,int k){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        int index = count-k;
        temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void print(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+ " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode result = removeKthNode(head,k);
        print(result);
    }
}
