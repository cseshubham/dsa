package arrays.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]= new int[]{3,1,45,12,9,6,8,10,15,7,21,18};
        mergeSorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSorting(int[] arr, int s, int e) {
        if(s>=e){
            return;
        }
        int m= s+ (e-s)/2;
        mergeSorting(arr,s,m);
        mergeSorting(arr,m+1,e);
        merge(arr,s,m,e);
    }
    private static void merge(int[] arr, int s, int m, int e) {
       // System.out.println("s: "+ s +" e: "+ e);
        int merge[]= new int[e-s+1];
        int ind1=s;
        int ind2=m+1;
        int k=0;

        while (ind1<=m && ind2<=e){
            if(arr[ind1] <= arr[ind2]){
                merge[k]=arr[ind1];
                k++;
                ind1++;
            }else {
                merge[k]=arr[ind2];
                k++;
                ind2++;
            }
        }
        while(ind1<=m){
            merge[k]=arr[ind1];
            k++;
            ind1++;
        }
        while(ind2<=e){
            merge[k]=arr[ind2];
            k++;
            ind2++;
        }
        for (int i = 0,j=s; i <merge.length; i++,j++) {
            arr[j]=merge[i];
        }
    }
}
