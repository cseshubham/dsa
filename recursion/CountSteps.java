package recursion;

public class CountSteps {
    public static void main(String[] args) {
        int num=14;
        int stepts=countSteps(num);
        System.out.println(stepts);
    }

    private static int countSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int count) {
        if(num==0){
            return count;
        }

        if(num%2==0){
        return helper(num/2,++count);
        }else {
            return helper(num-1,++count);
        }
    }
}
