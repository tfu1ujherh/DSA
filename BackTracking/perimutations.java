package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class perimutations {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<Integer>current=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        solve(0, nums, current, res);

        System.out.println(res);
    }


    public static void solve(int index,int nums[],List<Integer>current,List<List<Integer>>res){

        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        for(int i=0;i<nums.length;i++){
            current.add(nums[i]);
            solve(index+1, nums, current, res);
            current.remove(current.size()-1);
        }

    }
}
