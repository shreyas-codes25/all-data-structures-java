package graphAdjacencyMatrixPackage;
import java.util.ArrayList;
import java.util.LinkedList;
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

    public ArrayList<GNode> getNext(GNode node){
        ArrayList<GNode> nextneg = new ArrayList<GNode>();
        int nodeindex=node.weight;

        for(int i=0;i<adj.length;i++){
            if(adj[nodeindex][i]==1){
                nextneg.add(nodelist.get(i));
            }
        }
        return nextneg;
    }

    void bfsVisit(GNode node){
        LinkedList<GNode> queue=new LinkedList<GNode>();
        queue.add(node);

        while(!queue.isEmpty()){
            GNode curr = queue.remove(0);
            curr.isvisited=true;
            System.out.print(curr.vertex+" ");
            ArrayList<GNode> nextneg=getNext(curr);
            for(GNode next: nextneg){
                if(!next.isvisited){
                    next.isvisited=true;
                    queue.add(next);
                }
            }
        }
    }

    public void bfs(){
        for(GNode node:nodelist){
            if(!node.isvisited){
                bfsVisit(node);
            }
        }
    }

}
