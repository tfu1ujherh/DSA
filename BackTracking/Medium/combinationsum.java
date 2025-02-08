// package BackTracking.Medium;
import  java.util.*;
public class combinationsum {
    public static void main(String[] args) {
        
        int target=7;
        int nums[]={2,3,6,7};
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        solve(0, nums, target, current, res);
        System.out.println(res);

    }
    public static void solve(int index,int nums[],int target,List<Integer>current,List<List<Integer>>res){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(nums[i]>target){
                continue;
            }
            current.add(nums[i]);
            solve(i, nums, target-nums[i], current, res);
            current.remove(current.size()-1);
        }
    }
}
