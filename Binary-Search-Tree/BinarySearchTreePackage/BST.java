package BinarySearchTreePackage;
public class BST {
    Node root;
  

    void insert(int data){
        root = insert(root, data);
        }

    Node insert(Node root,int key){
        if(root == null){
            root =new Node(key);
            return root;
        }
        else if(root.data>key){
                root.left=insert(root.left,key);
        }else if(root.data<key){
            root.right=insert(root.right,key);
        }
        return root;
        
    }
    void minVal(){
        System.out.println( "The smallest Node is "+minVal(root));
    }
    int minVal(Node root){
        int minval = root.data;
        while(root.left!=null){
            minval=root.left.data;
            root=root.left;
        }
        return minval;
    }
    void maxVal(){
        System.out.println("The largest tree value is "+maxVal(root));
    }
    int maxVal(Node root){
        int maxval = root.data;
        while(root.right!=null){
            maxval = root.right.data;
            root = root.right;
        }
        return maxval;
    }
    void preorder(){
        preorder(root);
    }
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
