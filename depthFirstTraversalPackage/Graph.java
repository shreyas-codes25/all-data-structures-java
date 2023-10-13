package depthFirstTraversalPackage;
import java.util.LinkedList;
class Graph {
    private int V;                              //number of nodes
 
    private LinkedList<Integer> adj[];              //adjacency list
    @SuppressWarnings("unchecked")
    public Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        
        for (int i = 0; i < v; ++i){

          adj[i] = new LinkedList<Integer>();
    	}
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);      
        adj[w].add(w);                        //adding an edge to the adjacency list (edges are bidirectional in this example)
    }
 
    void DFSUtil(int vertex, boolean nodes[])
    {
        nodes[vertex] = true;                         //mark the node as explored
        System.out.print(vertex + " ");
        int a = 0;
 
        for (int i = 0; i < adj[vertex].size(); i++)  //iterate through the linked list and then propagate to the next few nodes
            {
                a = adj[vertex].get(i);
                if (!nodes[a])                    //only propagate to next nodes which haven't been explored
                {
                    DFSUtil(a, nodes);
                }
            }  
    }

    void DFS(int v)
    {
        boolean already[] = new boolean[V];             //initialize a new boolean array to store the details of explored nodes
        DFSUtil(v, already);
    }
    
    
}
