import java.util.ArrayList;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        combination(list,new ArrayList<>(),candidates,0,target);
        return list;
    }
    public static void combination(ArrayList<ArrayList<Integer>> list,ArrayList<Integer>temp,int[] candidates,int start,int target){
        if(target==0){
            list.add(new ArrayList(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target)continue;
            temp.add(candidates[i]);
            combination(list,temp,candidates,i,target-candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}
