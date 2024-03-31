package recursion;

public class DigitProduct {

    public static void main(String[] args) {
        int number= 1234210;
        int mul= calculateDigitProduct(number);
        System.out.println(mul);
    }

    private static int calculateDigitProduct(int number) {

        if(number%10==number){
            return number;
        }
        return number%10 * calculateDigitProduct(number/10);

    }
}
