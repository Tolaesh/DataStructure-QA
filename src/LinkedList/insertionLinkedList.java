package LinkedList;

import java.util.LinkedList;

public class insertionLinkedList {
    //creating node
    public  class Node {
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;

        }
        public Node head = null;
        public Node tail = null;
        public void addNode(int d){
            Node newNode = new Node(d);
            if(head ==null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public boolean search(int num){
            Node no= this;
            while(no != null){
                if(no.data == num) return true;
            }
            return false;
        }
    }

    public Node InsertAtBeginning(Node head, int val){
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        return head;

    }

    public void InsertAtEnd(Node[] head, int val){
        //creating new node
       Node newNode = new Node(val);
       //checking if the node is empity and assign the new node
       if(head[0] == null){
           head[0] = newNode;
           return;
       }
       //checking each node if they are pointing to null value
       Node curr = head[0];
       while(curr != null){
           curr = curr.next;
       }
       // the node pointing to null wll take the value of new created node
       curr.next = newNode;
    }


}
