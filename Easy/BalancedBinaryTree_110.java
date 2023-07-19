import java.util.Math;

public class BalancedBinaryTree_110{
    boolean balanced = true;
    public boolean isBalanced (TreeNode root) {
        
    }

    public int count (Treenode root) {
       if (root)
       if (root.left != null) {
            leftHeight = count (root.left)+1;
       }
       if (root.right != null) {
            rightHeight = count (root.right, height+1);
       }

       if (Math.abs(rightHeight - leftHeight) > 1) {

       }
       
    }
}