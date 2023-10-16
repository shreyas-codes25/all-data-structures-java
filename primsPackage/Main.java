package primsPackage;

public class Main {
    
 public static void main(String[] args) {
    PGraph2 g = new PGraph2();
    int INF=Integer.MAX_VALUE;
    // number of vertices in grapj
    int V = 5;
    // create a 2d array of size 5x5
    // for adjacency matrix to represent graph
    int[][] G = { { INF, 9, 75, INF,  INF }, 
	                { 9, INF, 95, 19, 42 }, 
	                { 75,95, INF, 51, 66 }, 
	                { INF, 19, 51, INF, 31 },
                  { INF, 42, 66, 31, INF } };
    g.primsalgo(G, V);
  }
    
}
