package arrays.sorting.cyclicsort;

import java.util.Arrays;

public class CyclicSort {
    //Cyclic sort for some range value 0-n or 1-n-1
    public static void main(String[] args) {
        int arr[] = new int[]{6,4,7,1,5,3,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int val=arr[i];
            int valCorrectIndex=val-1;
            if(val!=arr[valCorrectIndex]){
                swap(arr,i,valCorrectIndex);
            }else {
                i++;
            }
        }

    }
    private static void swap(int arr[],int firstIndex, int secondIndex){
        int tmp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=tmp;
    }
}
