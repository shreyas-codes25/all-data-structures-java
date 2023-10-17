package kruskalsPackage;


public class krus{
    int v=5;
    int parent[] = new int[v];

    int find(int i){
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

    public void kruskalsMST(int cost[][]){
        int no_edges=0;
        int mincost=0;

        for(int i=0;i<v;i++){
            parent[i]=i;
        }

        while(no_edges<v-1){
            int min=Integer.MAX_VALUE;
            int a=0;
            int b=0;

            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(find(i)!=find(j) && cost[i][j] <min) {
                        min=cost[i][j];
                        a=i;
                        b=j;
                    }
                }
            }
            union(a, b);
            System.out.printf("Edge %d (%d,%d)  :weigth=%d\n",no_edges++,a,b,min);
            mincost+=min;
        }
        System.out.println("The total cost of the minimum spanning tree is : "+mincost);
    }


}