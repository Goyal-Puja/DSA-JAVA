package tree;

import java.util.*;

public class ZigZagLevelOrderTraversal {
    public static List<List<Integer>> zigZagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int c = 1;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp = q.peek();
                q.poll();
                ans.add(temp.val);

                if(temp.left != null)
                    q.offer(temp.left);

                if(temp.right != null)
                    q.offer(temp.right);
            }
            if(c%2 == 0)
                Collections.reverse(ans);
                res.add(ans);
            c++;
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        ZigZagLevelOrderTraversal tree = new ZigZagLevelOrderTraversal();
        List<List<Integer>> zigZagTree = tree.zigZagLevelOrder(root);
        for(int i=0;i<zigZagTree.size();i++){
            System.out.print(zigZagTree.get(i)+" ");
        }
    }
}



//                 3                         [3]
//             /      \
//            9       20                    [20,9]
//                   /  \
//                 15    7                  [15,7]