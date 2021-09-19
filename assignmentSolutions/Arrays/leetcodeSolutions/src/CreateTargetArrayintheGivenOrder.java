public class CreateTargetArrayintheGivenOrder {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            ArrayList<Integer> n= new ArrayList<Integer>();
            int[] target = new int[nums.length];
            for(int i =0;i<nums.length;i++){
                n.add(index[i],nums[i]);
            }
            for(int i =0;i<nums.length;i++){
                target[i]=n.get(i);
            }
            return target;
        }
    }
}
