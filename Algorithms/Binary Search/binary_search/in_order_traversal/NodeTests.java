package in_order_traversal;

public class NodeTests {
    public static void main(String[] args) {
        Tree t1=new Tree();

        Node node1=new Node(1);
        t1.root=node1;
        node1.left= new Node(2);
        node1.right=new Node(3);
        node1.right.right=new Node(6);
        node1.left.left=new Node(4);
        node1.left.right=new Node(5);
        //t1.inorder();
        t1.postorder();
    }
}
