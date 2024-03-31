package numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 40; i++) {
            boolean isPrime= isPrime(i);
            System.out.println(i + " is prime "+ isPrime);
        }
    }

    private static boolean isPrime(int num) {
        int j=2;
        while (j*j <= num){
            if(num%j==0){
                return false;
            }
            j++;
        }
        return true;
    }
}
