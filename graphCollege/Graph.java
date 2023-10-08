package graphCollege;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;                // Number of vertices in the graph
    
    private LinkedList<Integer> adj[];  // Adjacency list to store graph edges
    private Queue<Integer> queue;  // Queue for BFS traversal

    // Constructor to initialize the graph with 'v' vertices
    @SuppressWarnings("unchecked")
    public Graph(int v) {
        this.V = v;  // Set the number of vertices
        
        
        adj =new LinkedList[V];
        // Create an array of LinkedLists for adjacency lists

        // Initialize each adjacency list
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }

        queue = new LinkedList<Integer>();  // Initialize the queue for BFS traversal
    }

    // Function to add an edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);  // Add vertex 'w' to the adjacency list of vertex 'v'
    }

    // Function to perform Breadth-First Search (BFS) traversal starting from a given 'startnode'
    void bfs(int startnode) {
        int travelNode = 0;  // Variable to track the node being traversed
        boolean visitedNodes[] = new boolean[V];  // Array to track visited nodes
        int a = 0;  // Temporary variable for storing adjacent nodes

        visitedNodes[startnode] = true;  // Mark the 'startnode' as visited
        queue.add(startnode);  // Add 'startnode' to the queue for traversal

        while (!queue.isEmpty()) {  // Continue traversal until the queue is empty
            travelNode = queue.poll();  // Get the next node from the queue
            System.out.print(travelNode + " ");  // Print the traversed node

            // Iterate through the adjacent nodes of the current node
            for (int i = 0; i < adj[travelNode].size(); i++) {
                a = adj[travelNode].get(i);  // Get the adjacent node

                // If the adjacent node has not been visited, mark it as visited and add it to the queue
                if (!visitedNodes[a]) {
                    visitedNodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }
}
