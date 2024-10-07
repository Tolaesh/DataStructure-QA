package LinkedList;

public class reverseLinkedList {
    static class Node {
        int data;
        Node next;
        public  Node (int head){
            this.data= head;
            this.next=null;
        }
    }
    public static Node reverseNode(Node head){
        Node curr = head, prev =null, next=null;

        while(curr != null){
            next =curr.next;
            curr.next = prev;
            prev= curr;
            curr =next;
        }
        return prev;

    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String args[]){

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        printList(head);

        head = reverseNode(head);

        System.out.print("\nReversed Linked List:");
        printList(head);    }
}
