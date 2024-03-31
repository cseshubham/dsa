package arrays.sorting.cyclicsort;

import java.util.Arrays;

public class MissingNumber {
    //for 0-N
    // https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,4,3,0,1};
        int missingNum=findMissingNumber(arr);
        System.out.println("Missing Num:: "+ missingNum);
        System.out.println(Arrays.toString(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int i=0;
        while (i<arr.length){
            int val=arr[i];
            int valCorrectIndex=val;
            if( valCorrectIndex<arr.length && val!=arr[valCorrectIndex] ){
                swap(arr,valCorrectIndex,i);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }

    private static void swap(int arr[],int firstIndex, int secondIndex){
        int tmp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=tmp;
    }
}
