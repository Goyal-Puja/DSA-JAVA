package tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBT {
    static class Pair{
        TreeNode node;
        int distance;

        Pair(TreeNode node,int distance){
            this.node = node;
            this.distance = distance;
        }
    }
    public static void topViewOfBT(TreeNode root){
        if(root == null)
            return;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));

        while(!queue.isEmpty()){
            Pair temp = queue.peek();
            queue.poll();
            TreeNode node = temp.node;
            int distance = temp.distance;

            if(!map.containsKey(distance)) {
                map.put(distance, node.val);
            }

            if(node.left != null){
                queue.offer(new Pair(node.left,distance-1));
            }
            if(node.right != null){
                queue.offer(new Pair(node.right,distance+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
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

        TopViewOfBT.topViewOfBT(root);
    }
}
