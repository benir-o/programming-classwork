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
    void postorder(Node node){
        if (node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }
    void postorder(){
        postorder(root);
    }


}
