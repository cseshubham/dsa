package recursion;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int arr[]= new int[]{28,29,32,2,5,7,10,15,17,21};
        int target=21;
        int index=search(arr,target,0,arr.length-1);
        System.out.println(index);
    }

    private static int search(int[] arr, int target, int s, int e) {

        if(s>e){
            return -1;

        }
        int m= s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if (arr[s] <= target && arr[m] >= target) {
                e = m - 1;
            }else {
                s=m+1;
            }
        }else {
            if(target>=arr[m] && target<=arr[e] ){
                s=m+1;
            }else {
                e=m-1;
            }

        }
        return search(arr,target,s,e);
    }
}
