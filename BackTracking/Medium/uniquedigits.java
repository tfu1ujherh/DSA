public class uniquedigits {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(2));
        
    }

    public static int countNumbersWithUniqueDigits(int n){
        int res=10;

        if(n==0){
            return 1;
        }
        if(n==1){
            return  10;
        }
        int a=9;
        int b=9;

        for(int i=2;i<=n;i++){
            a=a*b;
            res=res+a;
            b--;
        }
        return res;
    }

}
