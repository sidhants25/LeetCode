// public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }

public class DiameterBinaryTree_543 {

    private int max = 0;
 
    public int diameterOfBinaryTree(TreeNode root) {

        int test = BFS(root);
        return max;
        
    }

    public int BFS(TreeNode root) {

         if (root.left == null && root.right == null) {
            return 1;
        }

        int maxLeft = 0;
        if (root.left != null) {
            maxLeft = BFS(root.left);
        }

        int maxRight = 0;
        if (root.right != null) {
            maxRight = BFS(root.right);
        }

        if (maxRight + maxLeft > max) {
            max = maxRight + maxLeft;
        }

        return Math.max(maxLeft, maxRight) + 1;
    }



}