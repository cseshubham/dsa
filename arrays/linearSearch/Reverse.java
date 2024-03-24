package arrays.linearSearch;

import java.util.Arrays;

import static arrays.linearSearch.Swap.swap;

public class Reverse {
    public static void main(String[] args) {
        int arr[]= new int[]{2,33,12,1,3,44,54,67};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
