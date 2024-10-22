package Sorting;

public class bubbleSort {
    public static boolean bubbleSort(int[] arr, int n ){
        boolean check = false;
        int temp=0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                    check =true;
                }
            }
            if(check ==false){
                break;
            }
        }

        return check;
    }
    public static void main(String[] args){
        int[] arr ={5,1,2,4};
        int n=4;
        System.out.println(bubbleSort(arr,n));
    }
}
