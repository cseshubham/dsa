package arrays;

public class BinarySearchRotatedSortedArray {
    //Not for duplicate elements
    public static void main(String[] args) {
        int arr[]= new int[]{21,22,23,26,28,31,1,3,5,7,9,12,15,20};
        int peek= findPeekUsingBinarySearch(arr);
        System.out.println("peek: "+ peek);
        System.out.println("how many time array roated ? answer : "+ peek+1);
        int target=3;
        int res=-1;
        if(arr[peek]==target){
            res=peek;
        }else {
            res=binarySearch(arr,0,peek-1,target);
            System.out.println("res1 "+ res);
        }
        if(res==-1){
            res=binarySearch(arr,peek+1,arr.length-1,target);
            System.out.println("res2 "+ res);
        }
        System.out.println(res);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {

        while (start<=end){
            int mid= start+ (end-start)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid]> target) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    private static int findPeekUsingBinarySearch(int[] arr) {
        int start=0;
        int end= arr.length-1;
        int maxIndex=-1;
        while (start<end){
            int mid= start+ (end-start)/2;
            //First Condition
            if(arr[mid] > arr[mid+1] ){
                return  mid;
            }
            //second condition
            if(arr[mid-1]>arr[mid]){
                return  mid-1;
            }
            //third condition
            if(arr[start] > arr[mid]){
                end=mid+1;
            }//Fourth Condition
            else {
                start=mid+1;
            }
        }
        return maxIndex;
    }


}
