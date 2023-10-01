package ListUsingTree;

import java.util.ArrayList;

public class Node {
    String data;
    ArrayList<Node> childern;
    public Node(String data){
        this.data = data;
        this.childern = new ArrayList<Node>();
    }
    public void addChild(Node node){
        this.childern.add(node);
    }
    public String print(int level){
    String ret;
    ret = "  ".repeat(level)+data+"\n";
    for(Node node : this.childern){
        ret += node.print(level+1);
    }
    return ret;
    }
}
