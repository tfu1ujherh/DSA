package Basic;
public class palindromenumber {
    
    public static void main(String[] args) {
        
        int x=15631;
        boolean result=palindromeNumber(x);
        System.out.println("Palindrome:"+result);
    }
    public static boolean   palindromeNumber(int x){
        if(x<0){
            return false;
        }
        int original=x;
        int reverse=0;
        int digit;
        while(x>0){
            digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        return original==reverse;
    }
}
