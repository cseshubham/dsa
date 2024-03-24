package arrays.binarySearch;

public class SplitArrayLargestSum {
    // https://leetcode.com/problems/split-array-largest-sum/

    public static void main(String[] args) {
        int arr[]= new int[]{7,2,5,10,8};
        int sum=splitArray(arr,2);
        System.out.println(sum);
    }

    private static int splitArray(int[] arr, int maxParts) {
        int start=0;
        int end=0;
        for (int num:arr) {
            end+=num;
            start= Math.max(num,start);
        }
        System.out.println("start:: "+ start +" end ::" + end);

        while(start<end){
            int mid= start + (end-start)/2;
            int sum=0;
            int parts=1;

            for (int num:arr) {
                if(sum+num > mid){
                    sum=num;
                    parts++;
                }else {
                    sum+=num;
                }
            }
            if (parts>maxParts){
                start=mid+1;
            }else {
                end=mid;
            }

        }

        return end;
    }


}
