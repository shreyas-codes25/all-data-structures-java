package kruskalsPackage;

public class Main {
    public static void main(String args[]){
    int INF=Integer.MAX_VALUE;
    
    krus k = new krus();
    int cost[][]={{INF,2,INF,6,INF},
                  {2,INF, 3, 8, 5},
                  {INF,3,INF,INF,7},
                  {6,8,INF, INF, 9},
                  {INF,5,7,9,INF}};
    k.kruskalMST(cost);
}
    
}
