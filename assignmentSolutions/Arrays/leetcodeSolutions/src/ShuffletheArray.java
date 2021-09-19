public class ShuffletheArray {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] a = new int[nums.length];
            int temp=0;
            for(int i =0;i<nums.length;i++){
                if(i%2==0){
                    a[i]=nums[temp];
                }
                else{
                    a[i]=nums[temp+n];
                    temp++;
                }
            }
            return a;

        }
    }
}
