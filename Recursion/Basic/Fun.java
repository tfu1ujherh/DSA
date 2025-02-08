class Fun{
    public static void main(String[] args) {
        System.out.println(fun(5));
    }
    public static int fun(int n){
        int x=1;
        int k;
        if(n==1){
            return  x;
        }
        for( k=1;k<n;k++){
            x=x+fun(k)*fun(n-k);
        }
        return x;
    }
}