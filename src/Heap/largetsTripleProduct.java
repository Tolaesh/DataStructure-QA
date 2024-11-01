package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class largetsTripleProduct {
    //Signature
    //int[] findMaxProduct(int[] arr)
    //Input
    //n is in the range [1, 100,000].
    //Each value arr[i] is in the range [1, 1,000].
    //Output
    //Return a list of n integers output[0..(n-1)], as described above.
    //Example 1
    //n = 5
    //arr = [1, 2, 3, 4, 5]
    //output = [-1, -1, 6, 24, 60]
    //The 3rd element of output is 3*2*1 = 6, the 4th is 4*3*2 = 24, and the 5th is 5*4*3 = 60.

    public static int[] largetTripProd(int[] arr){
        // using heap
        int[] num =new int[arr.length];
        num[0] =-1;

        if(arr.length > 2){
            num[1] =-1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //for loop to add the numin to heap
        for(int i=0; i<arr.length; i++){
            minHeap.add(arr[i]);

            if(minHeap.size() > 3){
                minHeap.poll();
            }
            if(i >=2){
                Integer[] top = minHeap.toArray(new Integer[0]);
                num[i] = top[0] * top[1] * top[2];
            }
            else {
                num[i] = -1;
            }
        }
        return num;
    }

    public static void main(String[]  args){
        int[] num ={1,2,3,4,5};
        System.out.println(Arrays.toString(largetTripProd(num)));
      //  System.out.println((largetTripProd(num)));

    }
}
