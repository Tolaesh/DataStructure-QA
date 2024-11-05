package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class numOfVisbleNodes {

    //There is a binary tree with N nodes. You are viewing the tree from its left side and can see only the leftmost nodes at each level. Return the number of visible nodes.
    //Note: You can see only the leftmost nodes, but that doesn't mean they have to be left nodes. The leftmost node at a level could be a right node.
    //Signature
    //int visibleNodes(Node root) {
    //Input
    //The root node of a tree, where the number of nodes is between 1 and 1000, and the value of each node is between 0 and 1,000,000,000
    //Output
    //An int representing the number of visible nodes.
    //Example
    //            8  <------ root
    //           / \
    //         3    10
    //        / \     \
    //       1   6     14
    //          / \    /
    //         4   7  13
    //output = 4

    static class Node{
        int data;
        Node left;
        Node right;
        Node() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int numOfVisble(Node root){
        if(root == null) return 0;

        Queue<Node> q =new LinkedList<>();
        q.add(root);
        int count =0;

        while(!q.isEmpty()){
            int n = q.size();
            count++;
            for(int i=0; i<n; i++){
                Node curr =q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Node root_1 = new Node(8);
        root_1.left = new Node(3);
        root_1.right = new Node(10);
        root_1.left.left = new Node(1);
        root_1.left.right = new Node(6);
        root_1.right.right = new Node(14);
        root_1.left.right.left = new Node(4);
        root_1.left.right.right = new Node(7);
        root_1.right.right.left = new Node(13);
        int expected_1 = 4;
        int output_1 = numOfVisble(root_1);
        System.out.println(output_1);
    }
}
