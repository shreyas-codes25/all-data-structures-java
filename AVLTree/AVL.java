package AVLTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BiNode root;

    public AVL(){
        root =null;
    }
    //preorder call
    public void preOrder(){
        preOrder(root);
    }
    //inorder call
    public void inOrder(){
        inOrder(root);
    }
    // postorder call
    public void postOrder(){
        postOrder(root);
    }
    //preorder main
    public void preOrder(BiNode node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    //inorder main
     public void inOrder(BiNode node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.data);
        preOrder(node.right);
    }
    //postOrder main
     public void postOrder(BiNode node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.data);
    }
    public void levelT(){
        levelT(root);
    }
    public void levelT(BiNode node){
        Queue<BiNode> queue = new LinkedList<BiNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BiNode presentNode = queue.remove();
            System.out.print(presentNode.data+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    public BiNode search(BiNode node,int data){
        if(node == null){
            System.out.println("The searched Node is not found in the AVL tree");
            return null;
        }
        else if(node.data == data){
            System.out.println(data+" is present in AVL tree");
            return node;
        }
        else if(data<node.data){
            return search(node.left,data);
        }
        else{
            return search(node.right, data);
        }

    }
    public int getHeight(BiNode node){
        if(node == null){
            return 0;
        }
        return node.height;
    }
    public BiNode rotateRight(BiNode node){
        BiNode newRoot = node.left;
        node.right= node.left.right;
        newRoot.left=node;
        node.height = 1+Math.max(getHeight(node.left),getHeight(node.right));
        newRoot.height=1+Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
        
    }
}
