package arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
    /**
     * This is not stable Algo - no stable mean it can change order of same elements
     * worst case time complexity O(n^2)
     * the best suitable for small set of data
     */
    public static void main(String[] args) {
        int arr[] = new int[]{-1,12,-13,0,3,2,56,10,9,4,23,-3};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {

        for (int i = arr.length-1; i>0 ; i--) {
            int maxIndex=findMaxElementIndex(arr,i);
            swap(arr,maxIndex,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static  int findMaxElementIndex(int arr[], int end){
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for (int i = 0; i <=end ; i++) {
            if(max<arr[i]){
             max=arr[i];
             maxIndex=i;
            }
        }
        System.out.println("Max on each Itration : "+ max);
        return maxIndex;
    }

    private static void swap(int arr[],int firstIndex, int secondIndex){
        int tmp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=tmp;
    }
}
