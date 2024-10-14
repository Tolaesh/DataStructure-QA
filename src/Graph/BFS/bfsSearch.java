package Graph.BFS;

import java.util.*;

public class bfsSearch {
    //bfs use queue(FIFO)
    //BFS - explores all neighbors at the present depth before moving to the next level.
    public static void bfs(Map<Integer, List<Integer>> graph, int start){
        //Using queue to add cthe nodes
        Queue<Integer> q = new LinkedList<>();
        //use Set to check the visted node
        Set<Integer> vis = new HashSet<>();
        //adding the start node to the queue
        q.offer(start);
        vis.add(start);

        // unitl the q is not null we loop trough the graph
        while(!q.isEmpty()){
            //going through the nexr node
            int node= q.poll();
            System.out.println(node + " ");
            //loop through the neigh nodes using List to the integers
            List<Integer> neigh = graph.getOrDefault(node, new ArrayList<>());
            for(int x: neigh){
                //check the neigh as we checked the first node(start)
                if(!vis.contains(x)){
                    q.offer(x);
                    vis.add(x);
                }
            }
        }
    }
    //the graph looks like this
//
//                             0
//                            /  \
//                           1     2      ==> the graph will look like after BFS
//                          /  \    \           0 -1- 2-3- 4 -- 5
//                         3    4    5


    public static void main(String[] args) {
        // Create a sample graph using an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Adding edges for a sample graph
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(2));

        // Perform BFS starting from node 0
        System.out.println("BFS starting from node 0:");
        bfs(graph, 0);
    }
    //practice this questions for interview :
//    LeetCode: "Number of Islands" (solves connected components on a 2D grid).
//    LeetCode: "Binary Tree Level Order Traversal" (BFS on a tree).
//    HackerRank: "Shortest Reach in a Graph" (find shortest paths from a source node).
//    Codeforces: Many graph-related challenges, often involving BFS.

}
