package graphAdjacencyMatrixPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {
    public Execution(){
        ArrayList<GNode> nodelist = new ArrayList<GNode>();
    Scanner s = new Scanner(System.in);
    System.out.println("What are the total vertices ?");
    int tvertice = s.nextInt();
    String vertice;
    System.out.println("Enter your vertices one by one (alphabets only) :\n");
    for(int i=0;i<tvertice;i++){
        vertice = s.next();
        nodelist.add(new GNode(vertice,i));
    }
    
    
    Graph g = new Graph(nodelist);
    if(g!=null){
        System.out.println("The graph is successfully created");
    }
    System.out.println("Enter the edges total avaiable? : ");
    int edge=s.nextInt();
    System.out.println("Enter them one by one in format (x,y) : ");
    int c,r;
    for(int i =0;i<edge;i++){
        r = s.nextInt();
        c=s.nextInt();
        g.addEdge(r, c);
        System.out.println("edge no. "+(i+1)+" done");
    }
    System.out.println("Printing your Graph in adjacency matrix :\n\n\n");
    System.out.println(g.toString());
  s.close();
    }
}
