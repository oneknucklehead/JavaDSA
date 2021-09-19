public class ConcatenationOfArray {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] a = new int[n*2];

            for(int i =0;i<n;i++){
                a[i]=nums[i];
                a[i+n]=nums[i];
            }
            return a;
        }
    }
}
