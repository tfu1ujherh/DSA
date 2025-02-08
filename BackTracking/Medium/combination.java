// package BackTracking.Medium;
import java.util.*;


public class combination {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        solve(1, n, k, current, res);
        System.out.println(res);
    }
    public static void solve(int index,int n,int k,List<Integer>current,List<List<Integer>>res){

        if(current.size()==k){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<=n;i++){
            current.add(i);
            solve(i+1, n, k, current, res);
            current.remove(current.size()-1);
        }

    }

}
