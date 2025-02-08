package Recursion.Basic;
public class printnum {
    public static void main(String[] args) {
        
        System.out.println("Sum of n natutal numbers:"+ sumn(0, 1000));

    }
    public static int  sumn(int start,int end){
        if(start>end){
            return 0; 
        }

         return  start+sumn(start+1, end);
    }
}
