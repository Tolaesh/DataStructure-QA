package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class slowSum {

    //Signature:
    //int getTotalTime(int[] arr)
    //Input:
    //An array arr containing N integers, denoting the numbers in the list.
    //Output format:
    //An int representing the highest possible total penalty.
    //Constraints:
    //1 ≤ N ≤ 10^6
    //1 ≤ Ai ≤ 10^7, where *Ai denotes the ith initial element of an array.
    //The sum of values of N over all test cases will not exceed 5 * 10^6.
    //Example
    //arr = [4, 2, 1, 3]
    //output = 26
    //First, add 4 + 3 for a penalty of 7. Now the array is [7, 2, 1]
    //Add 7 + 2 for a penalty of 9. Now the array is [9, 1]
    //Add 9 + 1 for a penalty of 10. The penalties sum to 26.

    static int getTotalTime(int[] arr){
        //use priority queue to specifically select the sorted elemnt
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int total =0;
        int penality;

        //adding to the maxHeap
        for(int i: arr){
            maxHeap.add(i);
        }
        //loop theough until the maxHeap is not empity
        while(maxHeap.size() >1){
            int lar1 = maxHeap.poll();     //polling the first elemtn
            int lar2 = maxHeap.poll();      //polling the second element
            //add the two large number
            penality= lar1 + lar2;
            //adding until the maxHeap size(0
            total += penality;

            //adds the sum(penality to the queue
            maxHeap.add(penality);
        }
        return total;
    }

    public static void main(String[] args){
        int[] arr ={4, 2, 1, 3};
        System.out.println(getTotalTime(arr));
    }
}
