package kruskalsPackage;

public class krus{
    static int V;
    int parent[];
    int edges[][];
    static int INF=Integer.MAX_VALUE;

    public krus(int vertex,int weights[][]){
        krus.V=vertex;
        edges=weights;
        parent=new int[V];
    }

    public int find(int i){
        while(parent[i]!=i){
            i=parent[i];
        }
        return i;
    }

    void union(int a,int b){
        int x=find(a);
        int y=find(b);
        parent[x]=y;
    }

    public void krusCall(){
        krusMST(edges);
    }

    public void krusMST(int edges[][]){
        int no_edges=0;
        int mincost=0;
        for(int i=0;i<V;i++){
            parent[i]=i;
        }
        while(no_edges<V-1){
            int min=INF;
            int a=0;
            int b=0;
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if(find(i) != find(j) && edges[i][j] < min){
                        min = edges[i][j];
                        a=i;
                        b=j;
                    }
                }
            }
            union(a,b);
            System.out.printf("EDGE %d(%d,%d)  weight->%d\n",no_edges++,a,b,min);
            mincost+=min;
        }
        System.out.println("minimum cost is "+mincost);

    }
        public static void main(String args[]){
        int INF=Integer.MAX_VALUE;
        int weights[][]={{INF,2,INF,6,INF},
                         {2,INF, 3, 8, 5},
                         {INF,3,INF,INF,7},
                         {6,8,INF, INF, 9},
                         {INF,5,7,9,INF}};
        krus k = new krus(5, weights);
        k.krusCall();
    }

}


