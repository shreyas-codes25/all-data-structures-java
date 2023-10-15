package primsPackage;

import java.util.Arrays;
public class Prim2 {
    public void primAlgo(int G[][],int V){
        int INF=Integer.MAX_VALUE;
        int no_edge=0;
        boolean selected[] = new boolean[V];
        Arrays.fill(selected,false);

        selected[0]=true;
        System.out.println("EDGE : WEIGHT");

        while(no_edge <=V-1){
            int min = INF;
            int x=0;
            int y=0;

            for(int i=0;i<V;i++){
                if(selected[i]=true){
                    for(int j=0;j<V;j++){
                        if(!selected[j] && G[i][j] !=0){
                            if(min >G[i][j]){
                                min = G[i][j];
                                x=1;
                                y=1;
                            }
                        }
                    }
                }
            }
            System.out.println(x+" - "+y+" : "+G[x][y]);
            selected[y]=true;
            no_edge++;
        }
    }
    

}
