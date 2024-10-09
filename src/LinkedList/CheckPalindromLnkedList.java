package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class CheckPalindromLnkedList {
    static class Node {
        int data;
        Node next;

        public Node(int head) {
            this.data = head;
            this.next = null;
        }
    }
    public static boolean isPlaindrom(Node node){
        List<Integer> lis = new ArrayList<>();
        while(node !=null){
            lis.add(node.data);
            node =node.next;
        }
        int left =0;
        int right =lis.size()-1;

        while(left < right && lis.get(left) == lis.get(right)){
            left++;
            right--;
        }
        return left >= right;  //to confirm that the values matched all the way until the pointers crossed or met:
    }
    public static void main(String[] args){
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(1);
        System.out.println(isPlaindrom(node));
    }

}
