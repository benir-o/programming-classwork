package in_order_traversal;

public class Tree {
    Node root;

    public Tree(){

    }
    void inorder(Node node){
        if (node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    void inorder(){
        inorder(root);
    }


}
