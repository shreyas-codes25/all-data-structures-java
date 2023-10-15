package disJointSetPackage;

public class Main {
    public static void main(String args[]){
        java.util.ArrayList<WeightedNode> nodelist=new java.util.ArrayList<>();
        nodelist.add(new WeightedNode("A",0));
        nodelist.add(new WeightedNode("B",1));
        nodelist.add(new WeightedNode("C",3));
        nodelist.add(new WeightedNode("D",4));
        nodelist.add(new WeightedNode("E",5));

        
        Prims MST = new Prims(nodelist);
        MST.addweiEdge(0, 1, 5);
        MST.addweiEdge(0, 2, 13);
        MST.addweiEdge(0, 4, 15);
        MST.addweiEdge(1, 2, 10);
        MST.addweiEdge(1, 3, 8);
        MST.addweiEdge(2, 3, 6);
        MST.addweiEdge(3, 4, 20);
        MST.prims(nodelist.get(0));
    }
    
}
