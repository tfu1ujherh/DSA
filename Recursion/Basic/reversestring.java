package Recursion.Basic;

public class reversestring {
    public static void main(String[] args) {
        String str="Ariga Bhavani Shankar";
        System.out.println(reversestring(str));
    }

    public static String reversestring(String str){
        if(str.isEmpty()){
            return str;
        }

        return reversestring(str.substring(1))+str.charAt(0);

    }
}
