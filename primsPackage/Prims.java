package primsPackage;

import java.util.Arrays;

public class Prims{
    public void primAlgo(int cost[][],int tvertex){
        int INF= Integer.MAX_VALUE;
        int no_edge=0;

        boolean visited[] = new boolean[tvertex];
        Arrays.fill(visited,false);
        visited[0]= true;

        System.out.println("EDGE  :  WEIGHT");

        while(no_edge < tvertex-1){
            int min = INF;
            int x=0;
             int y=0;
            for(int i=0; i<tvertex;i++){
                if(visited[i]){
                    for(int j=0;j<tvertex;j++){
                        if(!visited[j] && cost[i][j] !=0){
                            if(cost[i][j] < min){
                                min = cost[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            no_edge++;
            visited[y] = true;
            System.out.println(x+","+y+"  "+min);
        }

    }

}