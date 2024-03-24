package arrays.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int array[]= new int[]{43,92,1,55,12,11,34,65,56,77,2};
        int index=search(array, 12);
        int index2=searchInRange(array, 1, 0, 4);
        int index3=searchInString("Shubham", 'h');

        System.out.println(index);
        System.out.println(index2);
        System.out.println(index3);

    }
    private static int searchInString(String str,char target) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    private static int searchInRange(int[] array,int target,int start,int end) {
        for (int i = start; i <= end; i++) {
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }

    private static int search(int[] array,int target) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
