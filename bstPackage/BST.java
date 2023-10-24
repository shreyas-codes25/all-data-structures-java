package bstPackage;

public class BST{
    Node root;

    void insert(int data){
        root = insert(root,data);
    }

    Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        else if(root.data < data){
            root.right = insert(root.right, data);
        }
        else{
            root.left = insert(root.left,data);
        }
        return root;
    }

    public void minVal(){
        System.out.println("The smallest value is : "+minVal(root));
    }

    private int minVal(Node root){
        int min=0;
        while(root.left != null){
            min=root.data;
            root = root.left;
        }
        return min;
    }

    public void maxVal(){
        System.out.println("The largest value is : "+maxVal(root));
    }

    private int maxVal(Node root){
        int max=0;

        while(root.right !=null){
            max=root.data;
            root= root.right;
        }
        return max;
    }

    public void search(int data){
        Node present = search(root,data);
        if(present==null){
            System.out.println("The data is not present in the tree");
        }
        else{
            System.out.println("The data is present in the tree");
        }
    }
    private Node search(Node root,int data){
        if(root == null ||root.data == data){
            return root;
        }
        else if(root.data > data){
            return search(root.right, data);
        }
        else{
            return search(root.left, data);
        }
    }

    public void inorder(){
        System.out.println("Inorder traversal : \n");
        inorder(root);
    }
    private void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void deleteNode(int choice){
       root= deleteNode(root,choice);
    }
    Node deleteNode(Node root, int data){
        if(root == null){
            return root;
        }

        if(root.data >data){
            root.left = deleteNode(root.left, data);
        }
        else if(root.data <data){
            root.right = deleteNode(root.left, data);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.data = minVal(root.right);
            root.right = deleteNode(root.right, data);
        }
        return root;
    }

}