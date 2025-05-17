package in_order_traversal;

import javax.print.attribute.standard.JobOriginatingUserName;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
