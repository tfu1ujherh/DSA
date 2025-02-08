class bulb{
    public static void main(String[] args) {

        
        
        int nums[]={1,0,1,0,1,1};
        int n=nums.length;
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                val=i;
                break;
            }
        }
        int res=n-val;

        System.out.println(res);
    }

}