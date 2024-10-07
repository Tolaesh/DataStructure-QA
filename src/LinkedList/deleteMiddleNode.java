package LinkedList;

public class deleteMiddleNode {
    static class  Node{
        int data;
        Node next;

        public  Node(int data){
            this.data =data;
            this.next =null;
        }
    }

    public static Node deleteMiddle(Node head){
        // Edge case: return null if there is only
        // one node.
        if (head.next == null)
            return null;

        int count = 0;
        Node p1 = head, p2 = head;

        // First pass, count the number of nodes
        // in the linked list using 'p1'.
        while (p1 != null) {
            count++;
            p1 = p1.next;
        }

        // Get the index of the node to be deleted.
        int middleIndex = count / 2;

        // Second pass, let 'p2' move toward predecessor
        // of the middle node.
        for (int i = 0; i < middleIndex - 1; ++i)
            p2 = p2.next;

        // Delete the middle node and return 'head'.
        p2.next = p2.next.next;
        return head;
    }
    public static void printList(Node data){
        Node temp =data;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        temp=null;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head = deleteMiddle(head);
        System.out.print
                ("Linked List after deleting the middle node: ");
        printList(head);
    }

}
