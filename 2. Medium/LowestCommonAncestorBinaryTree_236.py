class LowestCommonAncestorBinaryTree_236(object):
    def lowestCommonAncestor(self, root, p, q):
        parents = {}
        queue = [root]
        parents[root] = None
        found_p = False
        found_q = False
        while queue or not (found_p and found_q):
            node = queue.pop(0)
            if node == q:
                found_q = True
            if node == p:
                found_p = True
            if node.left:
                parents[node.left] = node
                queue.append(node.left)
            if node.right:
                parents[node.right] = node
                queue.append(node.right)
        
        seq = [p]
        curr = p
        while curr != None:
            new_node = parents[curr]
            seq.append(new_node)
            curr = new_node
        
        curr_2 = q
        while curr_2 != None:
            if curr_2 in seq:
                return curr_2
            curr_2 = parents[curr_2]
        
        return root