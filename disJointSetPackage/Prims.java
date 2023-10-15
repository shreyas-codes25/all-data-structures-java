package disJointSetPackage;
import java.util.ArrayList;
import java.util.PriorityQueue;;

public class Prims {
    ArrayList<WeightedNode> nodelist = new ArrayList<WeightedNode>();
    public Prims(ArrayList<WeightedNode> nodelist){
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
        
    }

    //Prims Algorithm

    void prims(WeightedNode node){
        for(int i=0;i<nodelist.size();i++){
            nodelist.get(i).distance=Integer.MAX_VALUE;
        }

        node.distance=0;
        PriorityQueue<WeightedNode> queue=new PriorityQueue<>();
        queue.addAll(nodelist);
        while(!queue.isEmpty()){
            WeightedNode currnode = queue.remove();
            for(WeightedNode neigh:currnode.neighbors){
                if(!queue.contains(neigh)){
                    if(neigh.distance>currnode.weightMap.get(neigh)){
                        neigh.distance=currnode.weightMap.get(neigh);
                        neigh.parent=currnode;
                        queue.remove(neigh);
                        queue.add(neigh);
                    }
                }
            }
        }
        int cost=0;

        for(WeightedNode nodetocheck:nodelist){
            System.out.println("Node "+nodetocheck+" key "+nodetocheck.distance+" Parent: "+nodetocheck.parent);
            cost = cost +nodetocheck.distance;
        }
        System.out.println("Total cost of MST : "+cost);
    }
    
}
