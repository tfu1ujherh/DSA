package BackTracking.Medium;

public class mergesort {
    public static void main(String[] args) {
        
        int nums[]={5,4,3,2,1};
        divide(nums, 0, nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void divide(int nums[],int start_index,int end_index){
        if(start_index>=end_index){
            return;
        }
        int mid=start_index+(end_index-start_index)/2;
        divide(nums, start_index, mid);
        divide(nums, mid+1, end_index);
        conquer(nums, start_index, mid, end_index);
    }

    public static void conquer(int nums[],int start_index,int mid,int end_index){

        int res[]=new int[end_index-start_index+1];
        int k=0;
        int index1=start_index;
        int index2=mid+1;
        while(index1<=mid && index2<=end_index){
            if(nums[index1]<=nums[index2]){
                res[k++]=nums[index1++];
            }else{
                res[k++]=nums[index2++];
            }
        }
        while(index1<=mid){
            res[k++]=nums[index1++];
        }
        while(index2<=end_index){
            res[k++]=nums[index2++];
        }
        for(int i=0,j=start_index;i<res.length;i++,j++){
            nums[j]=res[i];

        }


    }
}
