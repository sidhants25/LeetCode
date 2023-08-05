/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

public class CloneGraph_133 {
    
    public Node cloneGraph(Node node) {

        if (node == null){
            return null;
        }

        LinkedList<Node> queue = new LinkedList<>();
        HashMap<Node,Node> map = new HashMap<>();
        HashSet<Node> seen = new HashSet<>();

        Node curr;
        queue.add(node);

        while (!queue.isEmpty()) {

            curr = queue.removeFirst();
            if (seen.contains(curr)){
                break;
            }
            seen.add(curr);
            
            if (!map.containsKey(curr)) {
                map.put(curr,new Node(curr.val));
            }
            
            for (Node n : curr.neighbors) {
                
                if (!map.containsKey(n)) {
                    map.put(n, new Node (n.val));
                }
              
                map.get(curr).neighbors.add(map.get(n));
                
                if(!seen.contains(n)){
                    queue.add(n);
                    }
            }
        }

       return map.get(node);

    }
}