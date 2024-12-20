import java.util.Scanner;
class patterns{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        
        pattern7(n);
        
    }

    // Pattern-1
    // * * * *
    // * * * *
    // * * * *
    // * * * *
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern-2
    // *
    // * *
    // * * *
    // * * * *
    public static void pattern2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // Pattern-3
    //       *
    //     * *
    //   * * *
    // * * * *
    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern-4
    // * * * *
    // * * *
    // * *
    // *
    public static  void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){

                System.out.print("*");


            }
            System.out.println();

        }
    }

     // Pattern-5
    // * * * *
    //   * * *
    //     * *
    //       *
    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // Pattern-6
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    // Pattern-7
    // 1
    // 2 2 
    // 3 3 3

    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    


    


}