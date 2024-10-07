package LinkedList;

public class findMiddleNode {
    public  class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    //this is a helper function to find the middle node in linked list
    int getLength(Node head){
        int length =0;
        while(head != null){
            length++;
            head= head.next;
        }
        return length;
    }

    int getMiddle(Node head){
        int length = getLength(head);
        int mid_index = length/2;
        while (mid_index > 0){
            mid_index--;
            head = head.next;

        }
        return head.data;
    }


}
