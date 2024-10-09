package LinkedList;

import java.util.HashSet;

// Definition of a node in the linked list
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListRemoveDuplicates {

    // Function to remove duplicates from unsorted linked list
    public Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (set.contains(curr.data)) {
                // Duplicate found, skip current node
                prev.next = curr.next;
            } else {
                // Unique value, add it to the set
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }

    // Helper function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function to test the removeDuplicates method
    public static void main(String[] args) {
        LinkedListRemoveDuplicates list = new LinkedListRemoveDuplicates();

        // Creating a linked list with duplicate values
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(12); // Duplicate
        head.next.next.next.next = new Node(11); // Duplicate
        head.next.next.next.next.next = new Node(10); // Duplicate

        System.out.println("Original Linked List:");
        list.printList(head);

        // Remove duplicates
        head = list.removeDuplicates(head);

        System.out.println("Linked List After Removing Duplicates:");
        list.printList(head);
    }
}
