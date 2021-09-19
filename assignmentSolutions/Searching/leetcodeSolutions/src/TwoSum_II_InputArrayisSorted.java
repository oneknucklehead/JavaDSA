public class TwoSum_II_InputArrayisSorted {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int start = 0;
            int end=numbers.length-1;
            int[] ans = {0,0};
            while(start<end){
                if(numbers[start]+numbers[end]==target)
                {
                    ans[0]=start+1;
                    ans[1] = end+1;
                    return ans;
                }
                else if(numbers[start]+numbers[end]<target)
                    start++;
                else
                    end--;
            }
            return ans;
        }
    }
}
