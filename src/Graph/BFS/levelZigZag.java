package Graph.BFS;

import LinkedList.LinkedListCycle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelZigZag {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public List<List<Integer>> levelZigZag(Node root) {
            Queue<Node> que = new LinkedList<>();
            List<List<Integer>> lis = new ArrayList<>();

            que.offer(root);
            if (root == null) return lis;
            boolean checkLR = true;
            while (!que.isEmpty()) {
                List<Integer> res = new ArrayList<>();
                int n = que.size();
                for (int i = 0; i < n; i++) {
                    Node node = que.poll();

                    // Determine whether to add node values from left to right or right to left
                    if (checkLR) {
                        res.add(node.val);
                    } else {
                        res.add(0, node.val);  // Insert at the beginning for reverse order
                    }
                    if (node.left != null) {
                        que.offer(node.left);
                    }
                    if (node.right != null) {
                        que.offer(node.right);
                    }
                }
                lis.add(res);
            }
            return lis;
        }
    }
}
