package graphAdjacencyMatrixPackage;
import java.util.ArrayList;

public class Graph {
    ArrayList<GNode> nodelist = new ArrayList<GNode>();
    int adj[][];

    public Graph(ArrayList<GNode> nodelist){
        this.nodelist = nodelist;
        adj = new int[nodelist.size()][nodelist.size()];
    }
    //for undirected graph only 
    public void addEdge(int i ,int j){
        adj[i][j]=1;
        adj[j][i]=1;
    }

    public String toString(){
        StringBuffer str = new StringBuffer();

        str.append(" ");
        for(int i=0;i<nodelist.size();i++){
            str.append(nodelist.get(i).vertex+" ");
        }
        str.append("\n");
        for(int i=0;i<nodelist.size();i++){
            str.append(nodelist.get(i).vertex+" ");
            for(int j :adj[i]){
                str.append((j)+" ");

            }
            str.append("\n");
        }
        return str.toString();

    }



}
