public class LowestCommonAncestorBST_235{

     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == p) {
            return p;
        }

        if (root == q) {
            return q;
        }

        if (root != null) {
            if ((p.val < root.val && q.val > root.val) || ( p.val > root.val && q.val < root.val) ){
            return root;
        }
        else if (p.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        else return lowestCommonAncestor(root.left, p, q);
        }

        else return null;
        
    }
    
}