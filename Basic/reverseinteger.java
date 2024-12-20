package Basic;
public class reverseinteger {
    
    public static void main(String[] args) {
        int x=153;

        int result=reverseInt(x);

        System.out.println("Reversed Integer:"+result);
        
    }
    public static int reverseInt(int x){

        int reverse=0;
        int digit;

        while(x!=0){
            digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        return reverse;

    }
}
