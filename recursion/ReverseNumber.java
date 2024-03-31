package recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        int number=156;
        reverse2(number);
        System.out.println(sum);
    }

   public static int  sum=0;
    /**
     * 15 6=60
     * 1 5=650
     * 0 1=651
    */
    private static int reverse(int number) {

        while (number>0){
        int mod=number%10;
        sum=sum*10+mod;
        number=number/10;
        }
        return sum;
    }
    private static void reverse2(int number) {
        System.out.println("number" + number);
        if(number==0){
            return ;
        }
        int mod=number%10;
        sum=sum*10+mod;
        reverse2(number/10);
    }
}
