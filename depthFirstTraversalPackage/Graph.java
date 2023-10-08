package depthFirstTraversalPackage;
import java.util.LinkedList;
public class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public Graph(int v){
        this.V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int v,int w){
        adj[v].add(w);
    }
    void dfsReq(int v,boolean nodes[]){
        nodes[v]=true;
        System.out.print(v+" ");
        int a=0;
        for(int i=0;i<adj[v].size();i++){
            a = adj[v].get(i);
            if(!nodes[a]){
                nodes[a]=true;
                dfsReq(a, nodes);
            }
        }
    }
    void dfs(int v){
        boolean visited[] = new boolean[v];
        dfsReq(v, visited);
    }
    
    
}
