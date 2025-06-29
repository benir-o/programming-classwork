public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return "" + data;
    }

    static class LinkedList {
        Node head;

        public static int countNodes(Node head) {
            int count = 1;
            Node current = head;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            return count;
        }

        public void appendNode(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }

        public void printNodes() {
            while (head.next != null) {
                System.out.print(head + "-->");
                head = head.next;
            }
            System.out.println(head);
        }

    }

    public static void main(String[] args) {
        var l1 = new LinkedList();
        // At this point the head node is null
        l1.appendNode(20);
        l1.appendNode(30);
        l1.appendNode(40);
        l1.printNodes();
    }
}
