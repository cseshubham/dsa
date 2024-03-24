package arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = new int[]{-1,12,-13,0,3,2,56,10,9,4,23,-3};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }

    }
    private static void swap(int arr[],int firstIndex, int secondIndex){
        int tmp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=tmp;
    }

}
