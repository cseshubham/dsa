package arrays.sorting.cyclicsort;

import java.util.Arrays;

public class FindDuplicate {
    // https://leetcode.com/problems/find-the-duplicate-number/
    //1-N
    public static void main(String[] args) {
        int arr[] = new int[]{3,3,3,3,3};
        int missingNum= findDuplicateNumber(arr);
        System.out.println("Duplicate Num:: "+ missingNum);
        System.out.println(Arrays.toString(arr));
    }

    private static int findDuplicateNumber(int[] arr) {
        int i=0;
        while (i<arr.length){
            int val=arr[i];
            int valCorrectIndex=val-1;
            if( valCorrectIndex<arr.length && val!=arr[valCorrectIndex] ){
                swap(arr,valCorrectIndex,i);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return arr[j];
            }else break;
        }
        return arr.length;
    }

    private static void swap(int arr[],int firstIndex, int secondIndex){
        int tmp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=tmp;
    }
}
