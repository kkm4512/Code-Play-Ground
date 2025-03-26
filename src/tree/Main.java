package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair {
    Node node;
    int depth;

    public Pair(Node node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}

class Node {
    String name;
    List<Node> nodes = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }
    public void printNode() {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(this, 0));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node node = pair.node;
            int depth = pair.depth;
            String prefix = "-".repeat(depth);
            System.out.println(prefix + node.name);
            for ( Node n : node.nodes ) {
                queue.offer(new Pair(n, depth + 1));
            }

        }
    }
}

class Root {
    Node root;

    public Root(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void printRoot() {
        root.printNode();
    }
}

public class Main {
    public static void findNode(Node node, String name) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur.name.equals(name)) {
                cur.printNode();
                return;
            }
            queue.addAll(cur.nodes);
        }
    }

    public static void main(String[] args) {
        Root ceo = new Root(new Node("CEO"));
            Node 부장1 = new Node("부장1");
            ceo.getRoot().nodes.add(부장1);
                Node 팀장1 = new Node("팀장1");
                부장1.nodes.add(팀장1);
                    Node 사원1 = new Node("사원1");
                    Node 사원2 = new Node("사원2");
                    팀장1.nodes.add(사원1);
                    팀장1.nodes.add(사원2);
                Node 팀장2 = new Node("팀장2");
                Node 사원3 = new Node("사원3");
                부장1.nodes.add(팀장2);
                부장1.nodes.add(사원3);
            Node 부장2 = new Node("부장2");
            ceo.getRoot().nodes.add(부장2);
                Node 팀장3 = new Node("팀장3");
                부장2.nodes.add(팀장3);
                    Node 사원4 = new Node("사원4");
                    Node 사원5 = new Node("사원5");
                    팀장3.nodes.add(사원4);
                    팀장3.nodes.add(사원5);
        findNode(ceo.getRoot(),"팀장3");
    }
}