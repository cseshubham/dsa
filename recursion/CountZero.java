package recursion;

public class CountZero {

    public static void main(String[] args) {
        int num=4502010;
        int count=countZero(num);
        System.out.println(count);
    }

    private static int countZero(int num) {

        return helper(num,0);
    }

    private static int helper(int num, int count) {

        if (num==0){
            return count;
        }
        int rem=num%10;
        if(rem==0){
           return helper(num/10,++count);
        }else {

            return  helper(num/10,count);
        }
    }
}
