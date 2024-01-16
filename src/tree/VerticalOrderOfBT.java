package tree;

import java.util.*;

public class VerticalOrderOfBT {
    static class Pair{
        TreeNode node;
        int distance;
        Pair(TreeNode node,int distance){
            this.node = node;
            this.distance = distance;
        }
    }
    public static void verticalOrderOfBT(TreeNode root){
        if(root == null)
            return;

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair temp = queue.peek();
            queue.poll();
            TreeNode node = temp.node;
            int distance = temp.distance;

            if(!map.containsKey(distance)){
                map.put(distance,new ArrayList<>());
            }
            map.get(distance).add(node.val);

            if(node.left != null){
                queue.offer(new Pair(node.left,distance-1));
            }
            if(node.right != null){
                queue.offer(new Pair(node.right,distance+1));
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        VerticalOrderOfBT.verticalOrderOfBT(root);
    }
}
