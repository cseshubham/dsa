package arrays;

public class BinarySearchFloor {

    public static void main(String[] args) {
        int arr[]= new int[]{2,4,6,9,16,47,51,57,60};
        int index=binarySearch(arr,3);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]== target){
                return  mid;
            } else if(arr[mid]>target) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
         return end;
    }

}
