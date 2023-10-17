package primsPackage;
import java.util.Arrays;
public class Prims{
    public void prims(int v,int cost[][]){
        int no_edges=0;
        boolean visited[] = new boolean[v];
        Arrays.fill(visited,false);
        visited[0]=true;
        System.out.println("EDGE  :  WEIGHT");
        while(no_edges<v-1){
            int min=Integer.MAX_VALUE;
            int a=-1;
            int b=-1;

            for(int i=0;i<v;i++){
                if(visited[i]){
                    for(int j=0;j<v;j++){
                        if(!visited[j] && cost[i][j] !=0){
                            if(cost[i][j] <min){
                                min=cost[i][j];
                                a=i;
                                b=j;
                            }
                        }
                    }
                }
            }
            System.out.println(a+","+b+" : ->"+min);
            no_edges++;
            visited[b]=true;

        }
        
    }
}