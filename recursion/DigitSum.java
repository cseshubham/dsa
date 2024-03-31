package recursion;

public class DigitSum {

    public static void main(String[] args) {
        int number= 123421;
        int sum= calculateDigitSum(number);
        System.out.println(sum);
    }

    private static int calculateDigitSum(int number) {

        if(number==0){
            return 0;
        }
        return number%10 + calculateDigitSum(number/10);

    }
}
