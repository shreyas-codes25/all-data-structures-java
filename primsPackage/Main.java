package primsPackage;

public class Main {
    
 public static void main(String[] args) {
    Prims g = new Prims();
    int INF=Integer.MAX_VALUE;
    // number of vertices in grapj
    int V = 5;
    // create a 2d array of size 5x5
    // for adjacency matrix to represent graph
    int cost[][]={{INF,2,INF,6,INF},
                      {2,INF, 3, 8, 5},
                      {INF,3,INF,INF,7},
                      {6,8,INF, INF, 9},
                      {INF,5,7,9,INF}};
    g.prims(V,cost);
  }
    
}
