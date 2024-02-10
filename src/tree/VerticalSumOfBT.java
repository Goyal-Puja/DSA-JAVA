package tree;

import java.util.*;

public class VerticalSumOfBT {
    static class Pair{
        TreeNode root;
        int distance;
        public Pair(TreeNode root,int distance){
            this.root = root;
            this.distance = distance;
        }
    }

    public static void verticalSum(TreeNode root){
        if(root == null)
            return;

        TreeMap<Integer,Integer> verticalSumMap = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));

        while(!queue.isEmpty()){
            Pair pair = queue.poll();
            TreeNode treeNode = pair.root;
            int distance = pair.distance;

            verticalSumMap.put(distance,verticalSumMap.getOrDefault(distance,0)+treeNode.val);

            if(treeNode.left != null){
                queue.offer(new Pair(treeNode.left, distance-1));
            }

            if(treeNode.right != null){
                queue.offer(new Pair(treeNode.right,distance+1));
            }
        }

        for(Map.Entry<Integer,Integer> entry : verticalSumMap.entrySet()){
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }

    }

//    public static void calculateVerticalSum(TreeNode root, int verticalLevel, Map<Integer,Integer> verticalSumMap){
//        if(root == null)
//        return;
//
//        verticalSumMap.put(verticalLevel,verticalSumMap.getOrDefault(verticalLevel,0) + root.val);
//        calculateVerticalSum(root.left,verticalLevel-1,verticalSumMap);
//        calculateVerticalSum(root.right,verticalLevel+1,verticalSumMap);
//    }
//
//    public static void verticalSum(TreeNode root){
//        if(root == null)
//            return;
//        Map<Integer,Integer> verticalSumMap = new HashMap<>();
//        calculateVerticalSum(root,0,verticalSumMap);
//
//        for(Map.Entry<Integer,Integer> entry : verticalSumMap.entrySet()){
//            System.out.println(entry.getKey()+"-->"+entry.getValue());
//        }
//
//    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        VerticalSumOfBT sum = new VerticalSumOfBT();
        sum.verticalSum(root);
    }
}
