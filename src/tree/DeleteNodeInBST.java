package tree;

public class DeleteNodeInBST {
    public static int minValue(TreeNode root){
        int minVal = root.val;
        while(root.left != null){
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }

    public static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }
        if(key < root.val){
            root.left = deleteNode(root.left,key);
        } else if(key > root.val){
            root.right = deleteNode(root.right,key);
        } else {
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            root.val = minValue(root.right);
            root.right = deleteNode(root.right,root.val);
        }
        return root;
    }
    public static void inOrder(TreeNode root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int key = 3;

        TreeNode result = DeleteNodeInBST.deleteNode(root,key);
        DeleteNodeInBST.inOrder(result);
    }
}
