package kruskalsPackage;

public class krus {
    public static int V;
   static  int[] parent;
    static int INF=Integer.MAX_VALUE;
    int edges[][] ;
    krus(int v,int graph[][]){
        krus.V=v;
        parent=new int[V];
        edges= graph;

    }

    static int find(int i){
        while(parent[i]!=i){
            i=parent[i];
        }
        return i;
    }

    static void unoin(int a,int b){
        int first = find(a);
        int second = find(b);

        parent[first]=second;
    }
    static void kruskalMST(int graph[][]){
        int mincost=0;

        for(int i=0;i<V;i++){
            parent[i]=i;
        }

        int edge_count=0;
        while(edge_count<V-1){
            int min = INF;
            int a=-1;
            int b=-1;

            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if(find(i)!=find(j) && graph[i][j] <min){
                        min = graph[i][j];
                        a=i;
                        b=j;
                    }

                }
            }
            unoin(a, b);
            System.out.printf("Edge %d:(%d,%d)  : cost : %d\n",edge_count++,a,b,min);
            mincost+=min;
        }
        System.out.printf("total cost = "+mincost);
    }
    public void kruskalMSTCall(){
        kruskalMST(edges);
    }
    
    public static void main(String args[]){
        int cost[][]={{INF,2,INF,6,INF},
                      {2,INF, 3, 8, 5},
                      {INF,3,INF,INF,7},
                      {6,8,INF, INF, 9},
                      {INF,5,7,9,INF}};
        krus g= new krus(5,cost);
        g.kruskalMSTCall();



    }
    
}
