public class FindFirstandLastPositionofElementinSortedArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] arr={-1,1};
            arr[0]=search(target,true,nums);
            arr[1]=search(target,false,nums);
            return arr;
        }
        public int search(int target,boolean findFirstIndex,int[] nums){
            int start=0;
            int end=nums.length-1;
            int ans=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<nums[mid])
                    end=mid-1;
                else if(target>nums[mid])
                    start=mid+1;
                else{
                    ans=mid;
                    if(findFirstIndex){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    }
}
