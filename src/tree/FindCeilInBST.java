package tree;

public class FindCeilInBST {
    public static int findCeil(TreeNode root, int input){
        int ceil = -1;
        while (root != null){
            if(root.val == input)
                return input;

            else if(root.val < input){
                root = root.right;
            } else {
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right = new TreeNode(11);

        int input = 9;

        System.out.println(findCeil(root,input));

    }
}
