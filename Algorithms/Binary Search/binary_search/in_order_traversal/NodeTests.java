package in_order_traversal;

public class NodeTests {
    public static void main(String[] args) {
        Tree t1=new Tree();
        t1.appendLeft(3);
        t1.appendLeft(4);
        t1.appendLeft(5);
        Tree.printLNodes(t1);
    }
}
