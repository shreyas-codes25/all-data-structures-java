package graphAdjacencyListPackage;

import java.util.ArrayList;

public class Execution {
    public Execution(){
        ArrayList<GNode> nodelist = new ArrayList<GNode>();
        nodelist.add(new GNode("A", 0));
        nodelist.add(new GNode("B", 1));
        nodelist.add(new GNode("C", 2));
        nodelist.add(new GNode("D", 3));
        nodelist.add(new GNode("E", 4));

        Graph g = new Graph(nodelist);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println(g.toString());
    }
    
}
