public class DuplicateElement {
    class Solution {
        public int findDuplicate(int[] nums) {
            int i=0;
            while(i<nums.length){
                if(nums[i]!=i+1){
                    int correct = nums[i]-1;
                    if(nums[i]!=nums[correct])
                        swap(nums,i,correct);
                    else
                        return nums[i];
                }
                else
                    i++;

            }
            return -1;
        }

        static void swap(int[] a,int first, int second){
            int temp=a[first];
            a[first]=a[second];
            a[second]=temp;
        }
    }
}
