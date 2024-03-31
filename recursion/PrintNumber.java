package recursion;

public class PrintNumber {

    public static void main(String[] args) {
        int n = 10;
        printNumber(n);
        System.out.println();
        printNumberReverse(n);
    }

    private static void printNumber(int n) {
        if(n==0) {
            return ;
        }
        System.out.print(n + " ");
        printNumber(n-1);
    }

    private static void printNumberReverse(int n) {
        if(n==0) {
            //System.out.print(n + " ");
            return ;
        }
        printNumberReverse(n-1);
        System.out.print(n + " ");
    }
}
