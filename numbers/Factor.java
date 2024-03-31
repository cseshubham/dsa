package numbers;

public class Factor {
    public static void main(String[] args) {
        int num=36;
         findFactor(num);
    }

    private static void findFactor(int num) {
        for (int i = 1; i*i <= num ; i++) {
            if(num%i==0){
                System.out.println(i + " "+ num/i );
            }
        }
    }
}
