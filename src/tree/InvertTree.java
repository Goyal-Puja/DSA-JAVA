package tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
public class InvertTree {
    public static TreeNode invert(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode temp = q.peek();
            q.remove();

            TreeNode c = temp.left;
            temp.left = temp.right;
            temp.right = c;

            if(temp.left != null)
                q.add(temp.left);

            if(temp.right != null)
                q.add(temp.right);
        }
        return root;
    }
    public static void inorderTraversal(TreeNode root){
        if(root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        InvertTree invertTree = new InvertTree();
        invertTree.invert(root);
        invertTree.inorderTraversal(root);
    }
}
