package depthFirstTraversalPackage;

public class Main{
    public static void main(String agrs[]){
        Graph g= new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);
        System.out.println("Following is depth first traversal");
        g.DFS(0);
    }
}
