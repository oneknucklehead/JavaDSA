public class NumberofGoodPairs {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int k=0;
            int count=0;
            for(int i =0;i<nums.length;i++){
                k=i+1;
                while(k<nums.length){
                    if(nums[i]==nums[k])
                        count++;
                    k++;
                }
            }
            return count;
        }
    }
}
