/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class ValidateBST_98 {

   private boolean valid;
   private boolean seenMax;
   private boolean seenMin;

    public boolean isValidBST(TreeNode root) {
        valid = true;
        seenMax = false;
        seenMin = false;
        check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return valid;
    }

    public void check (TreeNode root, int min, int max) {

        if (root.val == Integer.MAX_VALUE) {
            if (seenMax) {
                valid = false;
                return;
            }
            seenMax = true;
        }

        if (root.val == Integer.MIN_VALUE) {
            if (seenMin) {
                valid = false;
                return;
            }
            seenMin = true;
        }


        if ((root.val >= max && max != Integer.MAX_VALUE)  || (root.val <= min && min != Integer.MIN_VALUE)) {
            valid = false;
            return;
        }

        if (root.left != null) {
            check(root.left, min, root.val);
        }

        if (root.right != null) {
            check(root.right,root.val, max);
        }
        
    }
}