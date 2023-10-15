package graphAdjacencyListPackage;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
public class Graph {
    
    ArrayList<GNode> nodelist = new ArrayList<GNode>();

    public Graph( ArrayList<GNode> nodelist){
        this.nodelist = nodelist;
    }
    public void addEdge(int i,int j){
        GNode fnode = nodelist.get(i);
        GNode snode = nodelist.get(j);
        fnode.neighbour.add(snode);
        snode.neighbour.add(fnode);
    }
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        for(int i=0;i<nodelist.size();i++){
            str.append(nodelist.get(i).name+"-->");
            for(int j=0;j<nodelist.get(i).neighbour.size();j++){
                if(j==nodelist.get(i).neighbour.size()-1){
                    str.append((nodelist.get(i).neighbour.get(j).name));
                }
                else{     
                    str.append((nodelist.get(i).neighbour.get(j).name)+"-->");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }
    //breath first traversal methods
    void bfsvisit(GNode node){
        LinkedList<GNode> queue = new LinkedList<GNode>();
        queue.add(node);

        while(!queue.isEmpty()){
            GNode curr = queue.poll();
            curr.isvisited=true;
            System.out.print(curr.name+" ");
            for(GNode next:curr.neighbour){
                if(!next.isvisited){
                    queue.add(next);
                    next.isvisited=true;
                }
            }
            
        }
       
    }
    //method call
    void bfs(){
        for(GNode node:nodelist){
            if(!node.isvisited){
                bfsvisit(node);
            }
        }                
    }

    //depth first traversal
    void dfsVisited(GNode node){
        Stack<GNode> stack = new Stack<GNode>();
        stack.push(node);
        while(!stack.isEmpty()){
            GNode curr = stack.pop();
            curr.isvisited=true;
            System.out.print(curr.name+" ");
            for(GNode neighbour:curr.neighbour){
                if(!neighbour.isvisited){
                    stack.push(neighbour);
                    neighbour.isvisited=true;
                }
            }
        }
    }

    void dfs(){
        for(GNode node :nodelist){
            if(!node.isvisited){
                dfsVisited(node);
            }
        }

    }


}
