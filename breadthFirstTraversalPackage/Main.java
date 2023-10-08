package breadthFirstTraversalPackage;

public class Main {
    public static void main(String agrs[]){
        Graph g= new Graph(6);
        
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(4, 5);
        g.addEdge(3, 5);
        g.addEdge(1, 2);
        g.addEdge(1, 0);
        g.addEdge(2, 1);
        g.addEdge(4, 1);
        g.addEdge(3, 1);
        g.addEdge(5, 4);
        g.addEdge(5, 3);
        System.out.println("Traversal");
        g.bfs(0);
    }
    
}