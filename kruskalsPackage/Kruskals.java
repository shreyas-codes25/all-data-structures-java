package kruskalsPackage;

public class Kruskals{
    static int v=5;
    static int parent[] = new int[v];

    static int find(int i){
        while(parent[i] != i){
            i = parent[i];
        }
        return i;
    }

    void union(int a,int b){
        int x=find(a);
        int y=find(b);

        parent[x]=y;
    }

    public void kruskalsMST(int cost[][]){
        int mincost=0;
        int edgecount=0;
        
        
        for(int i=0;i<v;i++){
            parent[i] = i;
        }

        while(edgecount<v-1){
            int vertex1 =0; 
            int vertex2=0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(find(i)!=find(j) && cost[i][j] <min) {
                        min=cost[i][j];
                        vertex1=i;
                        vertex2=j;
                    }
                }
            }
            union(vertex1,vertex2);
            mincost +=min;
            System.out.printf("Edge %d (%d,%d) : weight = %d\n",edgecount++,vertex1,vertex2,min);
        }
        System.out.println("Total cost of the kruskal graph was ="+mincost);
    } 

}