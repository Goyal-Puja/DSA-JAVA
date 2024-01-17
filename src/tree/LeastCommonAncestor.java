package tree;

public class LeastCommonAncestor {
    public static boolean check(TreeNode root, int num){
        if(root == null)
            return false;

        if(root.val == num)
            return true;

        if(check(root.left,num) || check(root.right,num))
            return true;

        return false;
    }

    public static TreeNode LCA(TreeNode root,int A,int B){
        if(root == null)
            return null;

        if(root.val == A || root.val == B)
            return root;

        TreeNode leftLCA = LCA(root.left,A,B);
        TreeNode rightLCA = LCA(root.right,A,B);

        if(leftLCA != null && rightLCA != null)
            return root;

        if(leftLCA == null)
            return rightLCA;
        else
            return leftLCA;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        int A = 6;
        int B = 1;

        if(LeastCommonAncestor.check(root,A) && LeastCommonAncestor.check(root,B)){
            TreeNode ans = LCA(root,A,B);
            System.out.println(ans.val);
        }
    }
}
