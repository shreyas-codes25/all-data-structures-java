package primsPackage;
import java.util.Arrays;

public class Prims{
    public void primsAlgo(int V,int cost[][]){
        int no_edges=0;
        int mincost=0;
        System.out.println("EDGES  :  WEIGHT");
        boolean visited[]= new boolean[V];
        Arrays.fill(visited,false);
        visited[0]=true;

        while(no_edges<V-1){
            int min=Integer.MAX_VALUE;
            int a=-1;
            int b=-1;

            for(int i=0;i<V;i++){
                if(visited[i]){
                    for(int j=0;j<V;j++){
                        if(!visited[j] && cost[i][j]!=0){
                            if(cost[i][j]<min){
                                min=cost[i][j];
                                a=i;
                                b=j;
                            }
                        }
                    }
                }
            }
            System.out.println("("+a+","+b+")  : "+min);
            no_edges++;
            visited[b]=true;
            mincost+=min;
        }
        System.out.println("TOTAL COST WAS : "+mincost);

    }
}