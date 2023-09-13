public class BinaryTreeLevelOrderTraversal_102 {


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> solution = new LinkedList<>();

        if (root == null) {
            return new LinkedList();
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        LinkedList<TreeNode> prev;

        queue.add(root);

        while (!queue.isEmpty()) {

            LinkedList<Integer> temp = new LinkedList<>();
            for(TreeNode n : queue) {
                temp.add(new Integer(n.val));
            }
            solution.add(temp);

            prev = queue;
            queue = new LinkedList<>();

            for (TreeNode n: prev) {

                if (n.left != null){
                    queue.add(n.left);
                }

                if (n.right != null){
                    queue.add(n.right);
                }

            }

        }

        return solution;
        
    }

    
}