package arrays;

import java.util.Arrays;

public class FindFirstAndLastPositionV2 {
    public static void main(String[] args) {
        int arr[]= new int[] {3,3,4,6,9,11,11,11,16,16,16,16,17};
        int first= binarySearch(arr,16,true);
        int last= binarySearch(arr,16,false);

        System.out.println(first +" "+ last);
    }
    private static int binarySearch(int[] arr, int target, boolean isFirst) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                 ans=mid;
                 if(isFirst){
                     end=mid-1;
                 }else {
                     start=mid+1;
                 }

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
