public class BuildArrayFromPermutation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            if(nums.length>=1 && nums.length<=1000){

                for(int i=0;i<nums.length;i++){
                    if((nums[i]>=0) && (nums[i]<nums.length))
                        ans[i]=nums[nums[i]];
                }
            }
            return ans;
        }
    }
}