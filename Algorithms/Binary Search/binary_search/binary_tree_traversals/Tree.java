package binary_tree_traversals;

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
    void preorder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
    void preorder(){
        preorder(root);
    }


}
