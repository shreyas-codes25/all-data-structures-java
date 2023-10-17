package kruskalsPackage;


public class krus{
    int v=5;
    int parent[] = new int[v];

    // used to find the parent of the vertex asked for, 
    //the find method searches if the element is present in the 
    // connected list of the parent;
    int find(int i){
        if(parent[i] == i){
            return i;
        }
        return find(parent[i]);
        
    }
    // if the parent of two elements is different then this method will join them together
    // in the kruskal's algorithm case , the union method is used to join one vertex to another
    // so that it'll form an edge therefore, connecting two vertices together so that those elements can get fixed in place
    // & not called again , therefore not repreating the same edge. 
    void union(int a,int b){
        int x=find(a);
        int y=find(b);

        parent[x]=y;
    }

    public void kruskalsMST(int cost[][]){
        int no_edges=0;
        int mincost=0;

        // initializing the total no. of elements with parent as them self,
        // initially all are disjoint set.
        for(int i=0;i<v;i++){
            parent[i]=i;
        }
        // till all the vertices are not connected
        while(no_edges<v-1){
            int min=Integer.MAX_VALUE;
            int a=0;
            int b=0;
            //main functionality lies here.
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(find(i)!=find(j) && cost[i][j] <min) {
                        min=cost[i][j];
                        a=i;
                        b=j;
                    }
                }
            }
            //joining two vertices together
            union(a, b);
            System.out.printf("Edge %d (%d,%d)  :weigth=%d\n",no_edges++,a,b,min);
            mincost+=min;
        }
        System.out.println("The total cost of the minimum spanning tree is : "+mincost);
    }


}