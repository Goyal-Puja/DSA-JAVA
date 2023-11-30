package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    TreeNode root;
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value = value;
            left = right = null;
        }
    }
    public TreeNode insert(TreeNode root,int data){
        if(root == null){
            root = new TreeNode(data);
            return root;
        }
        if(data < root.value){
            root.left = insert(root.left,data);
        }
        else if(data > root.value){
            root.right = insert(root.right,data);
        }
        return root;
    }
    public boolean search(TreeNode root,int data){
        if(root == null)
            return false;
        if(root.value == data)
            return true;

        if(root.value > data){
            return search(root.left,data);
        }
        else{
            return search(root.right,data);
        }
    }

    public void inOrderTraversal(TreeNode root){

        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.value+" ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root){

        if(root != null){
            System.out.print(root.value+ " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){

        if(root != null){
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
            System.out.print(root.value+ " ");
        }
    }

    public void levelOrder(TreeNode root){   // level order traversal using queue
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            TreeNode tempNode = q.poll();
            System.out.print(tempNode.value+" ");

            if(tempNode.left != null){
                q.offer(tempNode.left);
            }
            if(tempNode.right != null){
                q.offer(tempNode.right);
            }
        }
    }

    public ArrayList<Integer> rightView(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode tempNode = q.peek();
                q.poll();
                if(i == size-1){
                    ans.add(tempNode.value);

                    if(tempNode.left != null){
                        q.offer(tempNode.left);
                    }
                    if(tempNode.right != null){
                        q.offer(tempNode.right);
                    }
                }
            }
        }

        return ans;
    }

//    public Tree merge(Tree t1,Tree t2){
//        if(t1 == null && t2 == null){
//            return t1;
//        }
//        if(t1 == null && t2 != null){
//            return t2;
//        }
//        if(t1 != null && t2 == null){
//            return t1;
//        }
//        else{
//            t1.value += t2.value;
//            System.out.print(t1.value+" ");
//            t1.left = merge(t1.left,t2.left);
//            t1.right = merge(t1.right,t2.right);
//        }
//        return t1;
//    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        Tree tree = new Tree();
        tree.insert(root,3);
        tree.insert(root,1);
        tree.insert(root,2);
        tree.insert(root,5);

        TreeNode root1 = new TreeNode(4);
        Tree tree1= new Tree();
        tree1.insert(root,3);
        tree1.insert(root,1);
        tree1.insert(root,2);
        tree1.insert(root,5);
//
//        Tree result = new Tree();
//        result.merge(tree,tree1);

        System.out.print("In Order Traversal ---> ");
        tree.inOrderTraversal(root);
        System.out.println();
        System.out.print("Pre Order Traversal ---> ");
        tree.preOrderTraversal(root);
        System.out.println();
        System.out.print("Post Order Traversal ---> ");
        tree.postOrderTraversal(root);
        System.out.println();
        System.out.print("Level order Traversal ---> ");
        tree.levelOrder(root);
        System.out.println();
        System.out.println("Right view of a tree ---> ");
        System.out.println(tree.rightView(root));
        int searchValue = 5;
        if(tree.search(root,searchValue) == true){
            System.out.println("Given search value is present in a tree");
        }
        else{
            System.out.println("Given search value is not present in a tree");
        }

    }
}
