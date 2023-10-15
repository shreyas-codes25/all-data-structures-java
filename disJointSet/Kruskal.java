package disJointSet;
import java.util.*;
public class Kruskal {
    ArrayList<WeightedNode> nodelist = new ArrayList<WeightedNode>();
    ArrayList<UndirectedEdge> unedge = new ArrayList<UndirectedEdge>();

    public Kruskal(ArrayList<WeightedNode> nodelist){
        this.nodelist=nodelist;
    }
    
    public void addweiEdge(int first,int second,int weight){
        UndirectedEdge edge = new UndirectedEdge(nodelist.get(first), nodelist.get(second), weight);
        WeightedNode firstnode = edge.first;
        WeightedNode secondnode = edge.second;
        firstnode.neighbors.add(secondnode);
        secondnode.neighbors.add(firstnode);
        firstnode.weightMap.put(secondnode,weight);
        secondnode.weightMap.put(firstnode,weight);
        unedge.add(edge);
    }

    void kruskal(){
        DisJointSet.makeSet(nodelist);
        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {

            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.weight-o2.weight;
            }
            
        };
        Collections.sort(unedge,comparator);
    }
}
