package arrays;

public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[]=  new int[]{2,4,5,7,18,19,20,17,12,11,8,3,1};
        int peek= findPeek(arr);
        int target=27;
        int result=-1;
        if(arr[peek]== target){
            result=peek;
        } else  {
            result=binarySearch(arr,0,peek-1,target,true);
        }
        if(result==-1){
            result=binarySearch(arr,peek-1,arr.length-1,target,false);
        }
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int start, int end, int target, boolean asc) {

        while (start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                if(asc){

                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }else {
                if(asc){

                    start=mid+1;
                }else {
                    end=mid-1;
                }

            }

        }
        return -1;
    }

    private static boolean findOrder(int arr[],int start, int end) {
        //ASC =true
        //DESC =false
        if(arr[start]>arr[end]){
            return false;
        }
        return true;
    }

    private static int findPeek(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start!=end){
            int mid= start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
}
