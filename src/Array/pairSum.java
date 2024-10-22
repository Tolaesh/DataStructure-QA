package Array;

import java.util.HashMap;

public class pairSum {
    //Given a list of n integers arr[0..(n-1)],
    // determine the number of different pairs of elements within it which sum to k.
    public static HashMap<Integer, Integer> pairSums(int[] arr, int k){
        int count =0;
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0; i<arr.length; i++){
           int sum = k-arr[i];
            if(map.containsKey( k-arr[i])){
                count+=map.get(sum);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0+1));
        }
        return map;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int k=5;
        System.out.println(pairSums(arr,k));
    }
}
