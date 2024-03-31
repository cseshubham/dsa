package recursion;

public class CheckArraySorted {

    public static void main(String[] args) {
        int arr[]= new int[]{2,4,5,7,8,12,14,15};
        boolean ans=isArraySorted(arr,0);
        System.out.println(ans);
    }

    private static boolean isArraySorted(int[] arr,int s) {

        if(s+1>=arr.length){
            return true;
        }
/*
        if(arr[s]> arr[s+1]){
            return false;
        }*/
        return arr[s]< arr[s+1] && isArraySorted(arr,++s) ;
    }

}
