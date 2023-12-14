package javaDsPractice;

public class BST {
    Node root;
    void insert(int data){
       root= insert(data,root);
    }
    Node insert(int data, Node root){
        if(root == null){
            root = new Node(data);
            return root;
        }
        else if(root.data > data){
            insert(data , root.left);
        }
        else if(root.data < data){
            insert(data, root.right);
        }
        return root;

    }

}
