package Array;

import java.util.Arrays;

public class SeattingArrangement {
     //Signature
     //int minOverallAwkwardness(int[] arr)
     //Input
     //n is in the range [3, 1000].
     //Each height arr[i] is in the range [1, 1000].
     //Output
     //Return the minimum achievable overall awkwardness of any seating arrangement.
     //Example
     //n = 4
     //arr = [5, 10, 6, 8]
     //output = 4
     //If the guests sit down in the permutation [3, 1, 4, 2] in clockwise order around the table
     // (having heights [6, 5, 8, 10], in that order), then the four awkwardnesses between pairs of adjacent
     // guests will be |6-5| = 1, |5-8| = 3, |8-10| = 2, and |10-6| = 4, yielding an overall awkwardness of 4.
     // It's impossible to achieve a smaller overall awkwardness.
    public static int seattingArrg(int[] arr){
        //Sort the arr
        Arrays.sort(arr);  // Sort heights in ascending order
        int n = arr.length;
        int[] seating = new int[n];

        // Place elements in a zigzag pattern from the center outwards
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                seating[left++] = arr[i];
            } else {
                seating[right--] = arr[i];
            }
        }

        // Calculate maximum awkwardness
        int maxAwkwardness = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(seating[i] - seating[(i + 1) % n]);
            maxAwkwardness = Math.max(maxAwkwardness, diff);
        }

        return maxAwkwardness;
    }

    public static void main(String[] args){
        int[] num = {5,10,6,8};
        System.out.println(seattingArrg(num));
    }
}
