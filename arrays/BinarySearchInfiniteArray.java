package arrays;

import java.util.Arrays;

public class BinarySearchInfiniteArray {
//Assuming infinite array that mean - no index out of bound exception
//don't use arr.length

    public static void main(String[] args) {
        int arr[]= new int[]{1,3,4,5,6,7,9,13,14,16,17,19,24,35,47,58,60};
        int target=9;

        int[] range=findTargetRange(arr,target);
        //After range give to start end to binarySearchFunction
        System.out.println(Arrays.toString(range));
    }

    private static int[] findTargetRange(int[] arr, int target) {
        int start=0;
        int end=1;
        try {
            while(true){
                start=end+1;
                end=start+ end*2;
                if((target>=arr[start] && target<=arr[end])){
                    break;
                }
            }
        }catch (Exception e){
            return new int[]{start,end};
        }

        return new int[]{start,end};
    }
}
/**
 * s=0;
 * e=1
 * => s=e+1=2
 * e=s+e*2=4
 * => s=5
 * e=5+8=13


*/
