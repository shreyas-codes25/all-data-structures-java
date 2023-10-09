package breadthFirstTraversalPackage;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;                       // Number of vertices in the graph
    private LinkedList<Integer> adj[];    // An array to store lists of adjacent vertices for each vertex
    private Queue<Integer> queue;         // A queue to help with breadth-first traversal

    @SuppressWarnings("unchecked")
    public Graph(int v) {
        this.V = v;                       // Initialize the number of vertices
        adj = new LinkedList[V];           // Create an array to store adjacency lists for each vertex

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();  // Initialize each adjacency list
        }
        queue = new LinkedList<Integer>();  // Initialize the queue for BFS
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);                     // Add an edge between vertices v and w
    }

    void BFS(int startnode) {
        int travelnode = 0;                // Variable to keep track of the current node being visited

        boolean visited[] = new boolean[V]; // An array to keep track of visited nodes

        int a = 0;                          // Temporary variable for neighbors

        queue.add(startnode);              // Add the starting node to the queue

        while (!queue.isEmpty()) {
            travelnode = queue.poll();     // Remove the first node from the queue and visit it
            System.out.print(travelnode + " ");

            /* 
               This loop is used to visit all neighbors of the current node (represented by travelnode).
               It iterates through each neighbor (house connected by a road) and checks if it has been visited before.
               If a neighbor hasn't been visited, it marks it as visited and adds it to the queue for future visits.
            */
            for (int i = 0; i < adj[travelnode].size(); i++) {
                a = adj[travelnode].get(i); // Get the neighbors of the current node
                if (!visited[a]) {
                    visited[a] = true;      // Mark the neighbor as visited
                    queue.add(a);           // Add the neighbor to the queue for future visits
                }
            }
        }
    }
}
