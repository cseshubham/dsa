package arrays.binarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int arr[]= new int[] {3,3,4,6,9,11,11,11,16,16,16,16,17};
        int res[]=findFirstAndLastPos(arr,3);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findFirstAndLastPos(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int pos=-1;
        while (start<=end){

            int mid= start + (end-start)/2;
            System.out.println(" insideLOOP => pos "+ pos + " start "+ start +"end "+ end +"mid "+ mid);

            if(arr[mid]==target){
                pos= mid;
                break;
            } else if (arr[mid]> target) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }

        System.out.println("pos "+ pos + " start "+ start +"end "+ end );
        int firstPos=pos;
        int lastPos=pos;
        start=pos;
        end=pos;
        //find first
        while (end>0 && arr[end]==target){
            firstPos=end;
            end--;
        }
        while (start<arr.length && arr[start]==target){
            lastPos=start;
            start++;
        }
         return new int[]{firstPos,lastPos};
    }
}
