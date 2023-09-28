
public class TreeExample {
    public static void main(String args[]){
        BinaryTree2 s = new BinaryTree2();
        s.DisplayTree();
        System.out.println("\nTotal number of leaves in the given tree are ="+s.getLeafCount());
        s.printLeafNode(); 
        System.out.println("\nThe Height of the given tree is ="+s.getHeight());
       
    }
    
}
