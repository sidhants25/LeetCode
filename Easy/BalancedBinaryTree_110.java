import java.util.Math;

public class BalancedBinaryTree_110{

    public boolean isBalanced (TreeNode root) {
        return !(count(root) == -1);
    }

    public int count (TreeNode root) {
       
      if (root == null) {
          return 0;
      }

      int lheight = count (root.left);
      int rheight = count (root.right);

      if (lheight == -1 || rheight == -1){
          return -1;
      }

      else if (Math.abs(lheight - rheight) >= 2) {
          return -1;
      }

      else {
          return Math.max(lheight,rheight) + 1;
      }

       
    }
}