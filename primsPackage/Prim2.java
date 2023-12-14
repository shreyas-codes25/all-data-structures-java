package primsPackage;

import java.util.Arrays;
public class Prim2 {
   public void primAlgo(int cost[][] , int tvertex){
    int no_edge=0;
    int INF = Integer.MAX_VALUE;

    boolean visited[] = new boolean[tvertex];
    Arrays.fill(visited,false);
    visited[0]= true;

    System.out.println("EDGE : WEIGHT");

    while(no_edge < tvertex-1){
        int min = INF;
        int a =0;
         int b =0;

         for(int i=0;i<tvertex;i++){
            if(visited[i]){
                for( int j=0;j<tvertex;j++){
                    if(!visited[j] && cost[i][j] != 0){
                        if(cost[i][j] < min){
                            min = cost[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }
            }
         }
         no_edge++;
         visited[b] = true;
         System.out.println(a+","+b+"  "+min);
    }
   }
    

}
