public class ProductofArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] output = new int[nums.length];
            output[0]=1;
            for(int i=1;i<nums.length;i++){
                output[i]=nums[i-1]*output[i-1];
            }
            int R=1;
            for(int i=nums.length-2;i>=0;i--){
                R=R*nums[i+1];
                output[i]=output[i]*R;
            }
            return output;
        }
    }
}
