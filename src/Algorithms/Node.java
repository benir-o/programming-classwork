package Algorithms;

public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
    public String toString(){
        return "Data: "+data;
    }
class LinkedList{
        public static int countNodes(Node head, int sum){

            if (head.next==null){
                return sum;
            }
            else {
                return countNodes(head.next,sum+1);
            }
        }

}

    public static void main(String[] args) {
        Node nodeA=new Node(4);
        Node nodeB=new Node(2);
        Node nodeC=new Node(3);
        Node nodeD=new Node(10);
        nodeA.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;
        System.out.println(LinkedList.countNodes(nodeA,1));
    }
}
