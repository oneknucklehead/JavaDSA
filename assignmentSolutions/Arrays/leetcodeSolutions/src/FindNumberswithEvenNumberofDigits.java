public class FindNumberswithEvenNumberofDigits {
    class Solution {
        public int findNumbers(int[] nums) {
            int count =0;
            int dig=0;
            for(int i =0;i<nums.length;i++){
                dig=(int)Math.floor(Math.log10(nums[i])+1);
                if(dig%2==0)
                    count++;

            }
            return count;
        }
    }
}
