package LinkedList;

public class LinkedListCycle {
    static class Node {
        int data;
        Node next;

        public Node(int head) {
            this.data = head;
            this.next = null;
        }

        //A cycle occurs when a node's next points back to a previous node in the list.
        // The linked list is no longer linear with a beginning and end—instead, it cycles through a loop of nodes.

    }

    public boolean cycleLinked(Node head) {
        Node start = head;
        Node end = head;
        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;

            if (start == end) return true;
        }
        return false;
    }


    public static void main(String[] args){
        Node node = new Node(3);
        node.next = new Node(2);
        node.next.next= new Node(0);
        node.next.next.next= new Node(-4);

        LinkedListCycle solution = new LinkedListCycle();
        boolean result = solution.cycleLinked(node);
        System.out.println(result);


    }
}
