package arrays.binarySearch;

public class BinarySearchCeilingV2 {

    public static void main(String[] args) {
        char arr[]= new char[]{'a','c','k','p','r','y'};
        int index=binarySearch(arr,'b');
        System.out.println(index);
    }

    private static int binarySearch(char[] arr, int target) {
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
         return start>=arr.length?-1:start;
    }
}
