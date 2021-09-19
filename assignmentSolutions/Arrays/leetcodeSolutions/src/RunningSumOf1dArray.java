public class RunningSumOf1dArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            int[] a = new int[nums.length];
            if(nums.length>=1&&nums.length<=1000){
                for(int i=0;i<nums.length;i++){
                    for(int j=0;j<=i;j++){
                        if(nums[j]>=Integer.MIN_VALUE&&nums[j]<=Integer.MAX_VALUE)
                            a[i]+=nums[j];
                    }
                }
            }
            return a;

        }
    }
}
