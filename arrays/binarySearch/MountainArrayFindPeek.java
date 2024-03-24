package arrays.binarySearch;

public class MountainArrayFindPeek {

    public static void main(String[] args) {
        int arr[]=  new int[]{2,4,5,7,18,19,20,17,12,11,8,3,1};
        int max= binarySearchForPeek(arr);
        System.out.println(max);
    }

    private static int binarySearchForPeek(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start!=end){
            int mid= start +(end-start)/2;
            /*if(arr[mid] < arr[mid+1]){
                start=mid+1;
            }else {
                end=mid;
            }*/
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }

        return  start;
    }
}
