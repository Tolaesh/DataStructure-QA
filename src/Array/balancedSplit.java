package Array;

import java.util.Arrays;

public class balancedSplit {
    //Input
    //All integers in array are in the range [0, 1,000,000,000].
    //Output
    //Return true if such a split is possible, and false otherwise.
    //Example 1
    //arr = [1, 5, 7, 1]
    //output = true
    //We can split the array into A = [1, 1, 5] and B = [7].
    //Example 2
    //arr = [12, 7, 6, 7, 6]
    //output = false
    //We can't split the array into A = [6, 6, 7] and B = [7, 12] since this doesn't satisfy
    // the requirement that all integers in A are smaller than all integers in B.
    public static boolean balanceCheck(int[] arr) {
        Arrays.sort(arr);
        int totalSum = 0;
        for (int num = 0; num < arr.length; num++) {
            totalSum += arr[num];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            int right = totalSum - leftSum;
            if (right == leftSum && arr[i] < arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 7};
        System.out.println(balanceCheck(arr));

    }
}