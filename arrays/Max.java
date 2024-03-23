package arrays;

public class Max {
    public static void main(String[] args) {
        int arr[]= new int[]{2,5,77,1,3,66,13,19};
        int max=findMax(arr);
        int maxInRange=findMaxInRange(arr, 6, 7);
        System.out.println(max);
        System.out.println(maxInRange);
    }

    private static int findMax(int[] arr) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    private static int findMaxInRange(int[] arr,int startIndex,int endIndex) {
        int max=arr[startIndex];
        for (int i = startIndex+1; i <=endIndex; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
