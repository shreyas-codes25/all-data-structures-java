package kruskalsPackage;

public class Kruskals{
    int vertex = 5;
    int parent[] = new int[vertex];

    int find(int i ){
        while(parent[i] != i){
            i = parent[i];
        }
        return parent[i];
    }

    void union(int a,int b){
        int x = find(a);
        int y = find(b);

        parent[x] = y;
    }

    public void kruskalsMST(int cost[][]){
        int edge_count=0;
        int mincost =0;

        for(int i=0;i<vertex;i++){
            parent[i] = i;
        }

        while(edge_count < vertex-1){
            int vertex1 = 0;
            int vertex2 = 0;
            int min = Integer.MAX_VALUE;

            for(int i=0;i<vertex ;i++){
                for(int j =0;j<vertex;j++){
                    if(find(i) != find(j) && min > cost[i][j]){
                        min = cost[i][j];
                        vertex1 = i;
                        vertex2 = j;
                    }
                }
            }
            union(vertex1,vertex2);
            System.out.printf("Edge %d(%d,%d) weight = %d\n",edge_count++,vertex1,vertex2,min);
            mincost += min;
        }
        System.out.println("Total cost = "+mincost);
    }
}