public class InvertBinaryTree_226 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int value, TreeNode l, TreeNode r) {
            val = value;
            left = l;
            right = r;
        }
    }

    //226. Invert Binary Tree
    public TreeNode invertTree(TreeNode root) {
    flipTree(root);
    return root;
    }

    public void flipTree (TreeNode root) {

        if (root==null){
            return;
        }

       TreeNode temp = root.left;
       root.left = root.right;
       root.right = temp;

       flipTree(root.left);
       flipTree(root.right);


    }


}