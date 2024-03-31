package recursion;

public class NthFibonacciNumber {
    //This is not good solution if we increase nth value
    public static void main(String[] args) {
        int nth=7;
       // int nth=50; -- It will cry for this value
        int result= getNthFib(nth);
        System.out.println(result);
    }
//0 ,1 , 1, 2, 3, 5, 8, 13
//0, 1,  2, 3, 4, 5, 6, 7
    private static int getNthFib(int nth) {
        if(nth<2){
            return nth;
        }
        return getNthFib(nth-1)+ getNthFib(nth-2);
    }
}
