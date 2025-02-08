class demo {
    public static void main(String[] args) {
        int nums[]={3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
    public static  int dominantIndex(int[] nums) {

        int first_largest=Integer.MAX_VALUE;
        int second_largest=Integer.MAX_VALUE;
        int ind=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>first_largest){
                second_largest=first_largest;
                first_largest=nums[i];
            }else if(nums[i]!=first_largest && nums[i]>second_largest){
                second_largest=nums[i];
            }
        }

        int newmax=second_largest*2;

        for(int i=0;i<nums.length;i++ ){
            if(nums[i]==first_largest){
                ind=i;
            }
        }
        if(newmax>first_largest){
            return -1;
        }
        return ind;
    }
}