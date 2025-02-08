package Recursion.Basic;

public class sumofdigits {
    public static void main(String[] args) {
        
        int num=123;
        System.out.println(sum(num));

        
    }
    public  static int sum(int n){
        if(n==0){
            return 0;
        }

        return n%10+sum(n/10);
        
    }
}
