package Array;

public class freqOfUniqueKey {
    public static int frequency(int[] arr, int target){
        // Given a sorted array, find the frequency of the target.
        int count=0;
        for (int j : arr) {
            if (j == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr ={1,1,2,3,3,3,4,5};
        int k=1;
        System.out.println(frequency(arr,k));
    }
}
