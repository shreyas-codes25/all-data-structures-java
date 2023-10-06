package graphAdjacencyListPackage;

import java.util.ArrayList;

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
}
