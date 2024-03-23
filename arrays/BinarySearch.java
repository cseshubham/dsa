package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]= new int[]{2,3,12,25,43,49,51,67,79,99,101};
        boolean isNumberExist= binarySearch(arr,101);
        System.out.println("is target Number Exist: "+ isNumberExist);

        int arr2[]= new int[]{45,42,30,27,22,11,9,6};
        boolean isNumberExist2= binarySearch(arr2,45,findOrder(arr2));
        System.out.println("isNumberExist2: "+ isNumberExist2);
    }

    private static  String findOrder(int arr[]){
        String order="AESC";
        int start=0;
        int end=arr.length-1;

            if(arr[start]==arr[end]){
                order="SAME_ELEMENTS";
            } else if (arr[start]> arr[end]) {
                order="DESC";
            }
        System.out.println("Order is : "+ order);
        return order;
    }

    private static boolean binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid= start + (end-start)/2;

            if(arr[mid]==target){
                System.out.println("Number found on index: " + mid);
                return true;
            }
            else if(arr[mid]> target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] arr, int target, String order) {
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid= start + (end-start)/2;

            if(arr[mid]==target){
                System.out.println("Number found on index: " + mid);
                return true;
            }
            else if(arr[mid]> target){
                if(order=="AESC"){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else {
               if(order=="AESC"){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
