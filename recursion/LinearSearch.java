package recursion;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[]= new int[]{3,5,7,12,6,19,34,7,15,12,19};
        int target=7;
        ArrayList<Integer> result= new ArrayList<>();
        result= searchAllV2(arr,0,target);
        System.out.println(result);
    }

    private static int search(int[] arr, int index, int target) {

        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,++index,target);

    }

    private static ArrayList<Integer> searchAll(int[] arr, int index, int target, ArrayList<Integer> result) {

        if(index==arr.length){
            return result;
        }
        if(arr[index]==target){
            result.add(index);
        }
        return searchAll(arr,++index,target,result);

    }
    //here not taking result list as input param
    private static ArrayList<Integer> searchAll(int[] arr, int index, int target) {
        ArrayList<Integer> result = null;
        if(result==null){
            result=new ArrayList<>();
        }
        if(index==arr.length){
            return result;
        }
        if(arr[index]==target){
            result.add(index);
        }
        return searchAll(arr,++index,target,result);

    }
    private static ArrayList<Integer> searchAllV2(int[] arr, int index, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        if(index==arr.length){
            return result;
        }
        if(arr[index]==target){
            result.add(index);
        }
        ArrayList<Integer> findexIndex = searchAllV2(arr, ++index, target);
        result.addAll(findexIndex);
        return result;
    }
}
