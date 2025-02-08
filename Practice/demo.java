class demo{
    public static void main(String[] args) {
        int nums[]={1,22,22,22};

        System.out.println(majorityElement(nums));
        
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                num=nums[i];
            }
            if(num==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return num;
    }
}