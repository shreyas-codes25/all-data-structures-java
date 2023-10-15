package graphAdjacencyMatrixPackage;

public class GNode {
    public String vertex;
    public int weight;
    public boolean isvisited=false;

    public GNode(String vertex,int weight){
        this.vertex=vertex;
        this.weight=weight;
    }

}
