package Sorting;

public class selectionSort {
//Selection sort is a simple comparison-based sorting algorithm that works by repeatedly finding the smallest
// (or largest) element from the unsorted portion of the array and moving it to the sorted portion.
    public static boolean selectionSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int min =i;
            for(int j=0; j<n-1;j++) {

                if (arr[j] >min) {
                    min=j;
                }
            }
            int temp =arr[min];
            arr[min] = arr[i];
            arr[i] =temp;

        }
        return false;
    }
    public static void main(String[] args){
        int[] arr ={5,1,2,4};
        int n=4;
        System.out.println(selectionSort(arr,n));
    }
}
