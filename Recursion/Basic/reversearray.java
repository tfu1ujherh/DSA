package Recursion.Basic;

public class reversearray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        reverse(0, nums.length-1, nums);
        System.out.println("Array after reversal:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
    public static void reverse(int low,int high,int nums[]){

        if(low<high){
      
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            reverse(low+1, high-1, nums);
    }
 }
}
