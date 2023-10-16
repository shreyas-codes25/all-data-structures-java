package primsPackage;
import java.util.Arrays;

public class PGraph2{
    public void primsalgo(int G[][],int V){
        boolean visited[] =new boolean[V];
        Arrays.fill(visited,false);
        visited[0]=true;
        int INF=Integer.MAX_VALUE;
        int no_edge=0;
        System.out.println("EDGES  :  WEIGHT");

        while(no_edge <V-1){
            int min=INF;
            int x=0;
            int y=0;

            for(int i=0;i<V;i++){
                if(visited[i]){
                    for(int j=0;j<V;j++){
                        if(!visited[j] && G[i][j] !=0){
                            if(min > G[i][j]){
                                min = G[i][j];
                                x=i;
                                y=j;
                            }
                        }
                    }
                }
            }
            System.out.println(x+"  --  "+y+"  :  "+G[x][y]);
            visited[y]=true;
            no_edge++;
        }
    }
}