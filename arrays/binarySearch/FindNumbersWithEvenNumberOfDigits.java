package arrays.binarySearch;

public class FindNumbersWithEvenNumberOfDigits {
    //// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
        int arr[]= new int[]{12,1,223,1232,44,666,34232};

        int count=countEvenDigitNumber(arr);
        System.out.println(count);
    }

    private static int countEvenDigitNumber(int[] arr) {
        int evenDigitCount=0;
        for (int num:arr) {
           // int digitCount= countDigit(num);
            int digitCount= countDigitByMath(num);
            if(digitCount%2==0){
                System.out.println("Even Digit Number:: "+ num);
                evenDigitCount++;
            }
        }
        return  evenDigitCount;
    }

    private static int countDigit(int num) {
        int count=1;

        while (num>0){
            num=num/10;
            count++;
        }
        return count==1?count:count-1;
    }
    private static int countDigitByMath(int num) {
        return (int) Math.log10(num)+1;
    }
}
