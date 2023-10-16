package kruskalsPackage;

public class krus{
    static int V;
    static int parent[];
    int edges[][];
    int INF=Integer.MAX_VALUE;

    public krus(int vertex,int weights[][]){
        krus.V=vertex;
        this.edges=weights;
        parent = new int[V];
    }
    static int find(int i){
        while(parent[i]!=i){
            i=parent[i];
            System.out.print(i);
        }
        return i;
    }

    public void union(int first,int second){
        int a =find(first);
        int b=find(second);
        parent[a]=b;
    }

    public void krusCall(){
        krusMST(edges);
    }

    public void krusMST(int cost[][]){
        int no_edges=0;
        int mincost=0;

        for(int i=0;i<V;i++){
            parent[i]=i;
            
        }

        while(no_edges<V-1){
            int min=INF;
            int a=-1;
            int b=-1;

            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if(find(i) != find(j) && cost[i][j] < min){
                        min =cost[i][j];
                        a=i;
                        b=j;
                    }
                }
            }
            union(a,b);
            System.out.printf("EDGE %d(%d,%d) : weigth : %d\n",no_edges++,a,b,min);
            mincost+=min;
        }
        System.out.println("Total minimum cost was : "+mincost);
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


