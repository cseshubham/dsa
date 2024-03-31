package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]= new int[] {2,3,6,9,12,15,22,27,29,30,31};
        int target= 31;
        int resultIndex= binarySearch(arr,target,0,arr.length-1);
        System.out.println("resultIndex:: "+ resultIndex);
    }

    private static int binarySearch(int[] arr, int target, int s, int e) {

        if(s>e){
            return -1;
        }
        int m= s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]> target){
           return binarySearch(arr,target,s,m-1);
        }else {
            return binarySearch(arr,target,m+1,e);
        }
    }
}
