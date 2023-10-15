package graphAdjacencyListPackage;
import java.util.ArrayList;
public class GNode {
    public String name;
    public int index;
    public boolean isvisited=false;

    public ArrayList<GNode> neighbour = new ArrayList<GNode>();

    public GNode(String name,int index){
        this.name = name;
        this.index = index;
        
    }
    
}
