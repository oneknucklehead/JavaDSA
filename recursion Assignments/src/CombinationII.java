import java.util.*;

public class CombinationII {
    public static void main(String[] args) {

    }
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//
//    }
    private static List<List<Integer>> helper(int[] candidates, int start, List<Integer> list, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return ans;
        }
        if(start == candidates.length) {
            return ans;
        }
        for(int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if(candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            ans.addAll(helper(candidates, i + 1, list, target - candidates[i]));
            list.remove(list.size() - 1);
        }
        return ans;
    }
}
