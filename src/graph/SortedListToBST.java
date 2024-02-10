package graph;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
public class SortedListToBST {
    public static TreeNode convertListToBST(ListNode head){
        if(head == null)
            return null;
        if(head.next == null)
            return new TreeNode(head.val);

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        TreeNode root = new TreeNode(mid.val);
        root.left = convertListToBST(head);
        root.right = convertListToBST(mid.next);
        return root;
    }
    public static void inorderTraversal(TreeNode root){
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);

    }
    public static void main(String[] args){                              //         slow
         ListNode head = new ListNode(1);                            // 1 -> 2 -> 3 -> 4 -> 5
         head.next = new ListNode(2);                               //                     fast
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
         head.next.next.next.next = new ListNode(5);

         SortedListToBST sortedListToBST = new SortedListToBST();
         TreeNode result = sortedListToBST.convertListToBST(head);
         inorderTraversal(result);
    }
}
