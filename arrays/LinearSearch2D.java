package arrays;

import java.util.Arrays;

public class LinearSearch2D {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {12, 3, 34, 43},
                {121, 13, 1, 37},
                {44, 55, 35, 11}
        };

        int[] res = searchIn2D(arr, 11);
        int max= findMaxIn2D(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(max);
    }

    private static int findMaxIn2D(int[][] arr) {
        int max=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }

    private static int[] searchIn2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
