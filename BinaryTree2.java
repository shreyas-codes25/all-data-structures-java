import java.util.Scanner;


public class BinaryTree2{
    //for finding heiht of the tree
    public int lheight,rheight;
    // main root will be referenced through this
    public Node root;
    //constructor
    public BinaryTree2(){
        System.out.println("Input Tree: \n");
        Scanner s = new Scanner(System.in);
        root = createTree(s);

    }
    //this method will create a tree as the user enters the value of the nodes
    public Node createTree(Scanner s){
        int n =s.nextInt();
        //if value == -1 then it will be considered as the end of the node
        if(n==-1){
            return null;
        }
        else{
            Node tree = new Node(n);
            //recurrsive
            tree.left=createTree(s);
            tree.right=createTree(s);
            return tree;
        }


    }
    //displays the entire tree in inorder traversal
    public void DisplayTree(){
        System.out.println("Displaying tree in inorder traversal");
        inorder(root);
    }
    //this method is called in displaytree
    public void inorder(Node root){
        if(root==null){
            return;
        }
        else{
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);

        }
    }
    
    int getLeafCount(){
        return getLeafCount(root);
    }
    int getLeafCount(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        else{
            return getLeafCount(root.left)+getLeafCount(root.right);
        }
    }
    void printLeafNode(){
         printLeafNode(root);
    }
    void printLeafNode(Node root){
       // System.out.println("The Leaf nodes are:\n");
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            System.out.print(root.data+" ");
            return;
        }
        if(root.left!=null){
            printLeafNode(root.left);
        }
        if(root.right!=null){
            printLeafNode(root.right);
        }
    }
    int getHeight(){
        return getHeight(root);
    }
    int getHeight(Node root){
        if(root==null){
            return 0;
        }
        else{
            lheight =getHeight(root.left);
            rheight=getHeight(root.right); 
        }
        if(lheight>rheight){
            return (lheight+1);
        }
        else{
            return (rheight+1);
        }
    }
}