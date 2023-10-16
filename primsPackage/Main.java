package primsPackage;

public class Main {
    
 public static void main(String[] args) {
    PGraph2 g = new PGraph2();
    // number of vertices in grapj
    int V = 5;
    // create a 2d array of size 5x5
    // for adjacency matrix to represent graph
    int[][] G = { { 0, 9, 75, 0,  0 }, 
	                { 9, 0, 95, 19, 42 }, 
	                { 75,95, 0, 51, 66 }, 
	                { 0, 19, 51, 0, 31 },
                  { 0, 42, 66, 31, 0 } };
    g.primsalgo(G, V);
  }
    
}
