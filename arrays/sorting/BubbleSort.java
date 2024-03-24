package arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    /**
     * This is stable Algo - stable mean it doesn't change order of same elements
     * worst case time complexity O(n^2)
     *
     */
    public static void main(String[] args) {
        int arr[] = new int[]{-1,12,-13,0,3,2,56,10,9,4,23,-3};

        bubbleSort(arr);
    }
    private static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    isSwap=true;
                }
            }
            System.out.println(Arrays.toString(arr));
            if(!isSwap) break;
        }
    }

    private static void swap(int arr[],int firstIndex, int secondIndex){
        int tmp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=tmp;
    }
}
