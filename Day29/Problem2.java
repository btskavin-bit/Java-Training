import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
}

public class Problem2 {

    static HashMap<Node, Node> map = new HashMap<>();

    public static Node cloneGraph(Node node) {

        if (node == null)
            return null;

        if (map.containsKey(node))
            return map.get(node);

        Node copy = new Node(node.val);
        map.put(node, copy);

        for (Node n : node.neighbors) {
            copy.neighbors.add(cloneGraph(n));
        }

        return copy;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);

        a.neighbors.add(b);
        b.neighbors.add(a);

        Node clone = cloneGraph(a);

        System.out.println(clone.val);
    }
}