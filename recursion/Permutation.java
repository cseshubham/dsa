package recursion;

public class Permutation {
    public static void main(String[] args) {

        printPermutation("","ABC");
    }

    private static void printPermutation(String p,String up) {

        if(0==up.length()){
            System.out.print(p);
            System.out.print(", ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            printPermutation(f+ch+s,up.substring(1));

        }

    }
}
