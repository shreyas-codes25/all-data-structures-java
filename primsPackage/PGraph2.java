package primsPackage;
import java.util.Arrays;
public class PGraph2{
    public void primsalgo(int cost[][],int TV){
        int INF=Integer.MAX_VALUE;
        int no_edges=0;
        boolean visited[] = new boolean[TV];
        Arrays.fill(visited,false);

        visited[0]=true;
        System.out.println("EDGES :: WEIGHT");
        while(no_edges<TV-1){
            int min=INF;
            int a=0;
            int b=0;

            for(int i=0;i<TV;i++){
                if(visited[i]){
                    for(int j=0;j<TV;j++){
                        if(!visited[j] && cost[i][j]<min){
                            min=cost[i][j];
                            a=i;
                            b=j;
                        }
                    }
                }
            }
            System.out.println(a+" - "+b+"  :  "+cost[a][b]);
            visited[b]=true;
            no_edges++;
        }
    }
}