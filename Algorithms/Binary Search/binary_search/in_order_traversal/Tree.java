package in_order_traversal;

public class Tree {
    Node root;

    public Tree(){

    }
    public Node appendLeft(int data){
        var newNode= new Node(data);
        if (root==null){
            root=newNode;
            return root;
        }
        else{
            var currentNode=root;
            while(currentNode.left!=null){
                currentNode=currentNode.left;
            }
            currentNode.left=newNode;
            return currentNode.left;
        }
    }
    public static void printLNodes(Tree t1){

        while (t1.root!=null){
            System.out.println(t1.root.data);
            t1.root=t1.root.left;
        }

    }


}
