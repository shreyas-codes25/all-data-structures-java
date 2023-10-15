package disJointSet;

import java.util.ArrayList;
public class DisJointSet {
    ArrayList<WeightedNode> nodelist = new ArrayList<>();
    public static void makeSet(ArrayList<WeightedNode> nodelist){
        for(WeightedNode node :nodelist){
            DisJointSet set = new DisJointSet();
            set.nodelist.add(node);
            node.set=set;

        }
    }

    public static DisJointSet findSet(WeightedNode node){
        return node.set;
    }
    public static DisJointSet union(WeightedNode node1, WeightedNode node2){
        if(node1.set.equals(node2.set)){
            return null;
        }
        else{
            DisJointSet set1=node1.set;
            DisJointSet set2 = node2.set;

            if(set1.nodelist.size()>set2.nodelist.size()){
                ArrayList<WeightedNode> nodeset2 = set2.nodelist;
                for(WeightedNode node :nodeset2){
                    node.set=set1;
                    set1.nodelist.add(node);
                }
                return set1;
            }
            else{
                ArrayList<WeightedNode> nodeset1 = set1.nodelist;
                for(WeightedNode node :nodeset1){
                    node.set=set2;
                    set2.nodelist.add(node);
                }
                return set2;
            }
        }
    }

    public void pinrtAllNodesOfThisSet(){
        System.out.println("Printing all nodes of the set :");
        for(WeightedNode node :nodelist){
            System.out.print(node+" ");

        }
        System.out.println();
    }
    
}
