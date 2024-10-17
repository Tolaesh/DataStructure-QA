package Array;

import java.util.Arrays;

public class reverseToMakeEqual {
    public static boolean reverseToEqual(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args){
        int[] ar ={1,4,2,3,5};
        int[] arr2 = {1,5,2,4,3};
        System.out.println(reverseToEqual(ar,arr2));
    }
}
