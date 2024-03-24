package arrays.linearSearch;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[]= new int[]{2,10,5,55,1,7,99};
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int arr[],int firstIndex,int secondIndex){
        int temp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=temp;
    }
}
