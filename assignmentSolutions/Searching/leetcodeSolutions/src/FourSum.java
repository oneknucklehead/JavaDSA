public class FourSum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    int left =j+1;
                    int right = nums.length-1;
                    int newTarget= target-(nums[i]+nums[j]);
                    while(left<right){
                        if(nums[left]+nums[right]>newTarget)
                            right--;
                        else if(nums[left]+nums[right]<newTarget)
                            left++;
                        else{
                            List<Integer> quad = new ArrayList<Integer>();
                            quad.add(nums[i]);
                            quad.add(nums[j]);
                            quad.add(nums[left]);
                            quad.add(nums[right]);
                            ans.add(quad);
                            left++;right--;
                            while(left<right&&nums[left]==nums[left-1])++left;
                            while(left<right&&nums[right]==nums[right+1])--right;

                        }
                    }
                    while(j+1<nums.length&&nums[j+1]==nums[j])++j;
                }
                while(i+1<nums.length&&nums[i+1]==nums[i])++i;
            }
            return ans;
        }
    }
}
