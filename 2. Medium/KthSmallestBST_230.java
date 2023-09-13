public class KthSmallestBST_230 {
    public int kthSmallest(TreeNode root, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(k);

        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.removeFirst();
            heap.offer(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        for (int i = 1; i < k; i++) {
            heap.poll();
        }

        return heap.poll();
        
    }
}