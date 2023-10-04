package BinarySearchTreePackage;

import java.util.Scanner;

public class Execution {
    public Execution(){
        BST b = new BST();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("what is your total no. of Nodes? : ");
            int total = s.nextInt();
            System.out.println("Enter Root : ");
            int nodes = s.nextInt();
            b.insert(nodes);
            System.out.println("Enter rest of the tree");
            for(int j=0;j<total-1;j++){
                nodes=s.nextInt();
                b.insert(nodes);
            }
        

        b.minVal();
        b.maxVal();
        //b.preorder();
        
        System.out.println("Enter Element you want to search : ");
        int key = s.nextInt();
        boolean res = b.search(key);
        if(res)
            System.out.println("Item present");
        else    
            System.out.println("Item not found");
    }catch(Exception e){e.printStackTrace();}
    }
}
