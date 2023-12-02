package tree;

public class SortedArrayToBST {
    public static TreeNode convertArrayToBST(int[] arr,int start,int end){
        if(arr.length == 0)
            return null;
        if(start > end)
            return null;

        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = convertArrayToBST(arr,start,mid-1);
        root.right = convertArrayToBST(arr,mid+1,end);

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
        int[] arr = new int[]{1, 2, 3, 5, 10};
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
        TreeNode result = sortedArrayToBST.convertArrayToBST(arr,0,arr.length-1);
        sortedArrayToBST.inorderTraversal(result);
    }
}
