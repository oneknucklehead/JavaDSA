public class MajortiyElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int votes=0,candidate=-1;
            if(nums.length==1)
                return nums[0];
            for(int i=0;i<nums.length;i++){
                if(votes==0){
                    candidate=nums[i];
                }
                if(candidate==nums[i])
                    votes++;
                else
                    votes--;
            }
            return candidate;
            // int count=0;
            // for(int i=0;i<nums.length;i++){
            //     if(nums[i]==candidate)
            //         count++;
            // }
            // if(count>(nums.length/2))
            //     return candidate;
            // else
            //     return -1;
        }
    }
}
