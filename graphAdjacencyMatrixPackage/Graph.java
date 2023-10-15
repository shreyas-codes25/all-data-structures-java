package graphAdjacencyMatrixPackage;
import java.util.Stack;
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

    
    @Override
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
    //get next method to get the adjacent neighbours of the current node, used in both bfs and dfs
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
    //breath first traversal
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
    //method call
    public void bfs(){
        for(GNode node:nodelist){
            if(!node.isvisited){
                bfsVisit(node);
            }
        }
    }


    //dfs traversal

    void dfsvisit(GNode node){
        Stack<GNode> s = new Stack<GNode>();
        s.push(node);
        while(!s.isEmpty()){
            GNode curr = s.pop();
            curr.isvisited=true;
            System.out.print(curr.vertex+" ");
            ArrayList<GNode> next = getNext(curr);
            for(GNode nextneg:next){
                if(!nextneg.isvisited){
                s.push(nextneg);
                nextneg.isvisited=true;
                }
            }
        }
    }
    //method call for dfs
    void dfs(){
        for(GNode node :nodelist){
            if(!node.isvisited){
                dfsvisit(node);
            }
        }
    }

}
