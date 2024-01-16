package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBT {
    public static void LeftViewOfBT(TreeNode root){
        if(root == null)
            return;
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=0;i<n;i++){

                TreeNode temp = queue.peek();
                queue.poll();
                if(i == 0) {
                    result.add(temp.val);
                }
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }

            }
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right.right = new TreeNode(25);

        LeftViewOfBT.LeftViewOfBT(root);
    }
}
