package arrays.sorting.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberV2 {
    //for 1-N
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        int arr[] = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> missingNum=findMissingNumber(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Missing Num:: "+ missingNum);
    }

    private static List<Integer> findMissingNumber(int[] arr) {
        List<Integer> missingNums= new ArrayList<>();
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
                missingNums.add(j+1);
            }
        }
        return missingNums;
    }

    private static void swap(int arr[],int firstIndex, int secondIndex){
        int tmp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=tmp;
    }
}
