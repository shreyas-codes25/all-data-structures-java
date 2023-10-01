package ListUsingTree;

public class Main {
    public static void main(String args[]){
    Node  drinks = new Node("Drinks");
    Node  hot = new Node("Hot");
    Node  cold = new Node("Cold");
    Node  tea = new Node("tea");
    Node  coffee = new Node("coffee");
    Node  coke = new Node("coca cola");
    Node  sprite = new Node("sprite");
    drinks.addChild(hot);
    drinks.addChild(cold);
    hot.addChild(tea);
    hot.addChild(coffee);
    cold.addChild(coke);
    cold.addChild(sprite);

    System.out.println(drinks.print(0));
    }
}
