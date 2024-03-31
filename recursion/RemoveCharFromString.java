package recursion;

public class RemoveCharFromString {

    public static void main(String[] args) {
        /*String str="Shubhampatidara";
        StringBuilder res= new StringBuilder();
        removeChar(str,0,res);
        System.out.println(res);*/

        System.out.println("##");
        String newres= removeChar("iampatidar");
        System.out.println(newres);
    }

    private static void removeChar(String str, int s, StringBuilder res) {

        if(s>str.length()-1){
                return ;
        }
        if(str.charAt(s)!='a'){
            res.append(str.charAt(s));

        }
        removeChar(str,++s,res);
 }
    private static String removeChar(String str) {
        if(str.length()==0){
            return "";
        }
        char ch= str.charAt(0);
        if(ch == 'a' ){
            return removeChar(str.substring(1));
        }else {
            return ch + removeChar(str.substring(1));
        }
    }
}
