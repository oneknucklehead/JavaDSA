public class SingleElementinaSortedArray {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int start=0;
            int end=nums.length-1;
            int mid=0;
            while(start<=end){
                mid = start+(end-start)/2;
                if(mid==start||mid==nums.length-1||nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1])
                    break;
                else if(nums[mid-1]==nums[mid]){
                    if((mid-start)%2==0)end=mid-2;
                    else start=mid+1;
                }
                else {
                    if((mid-start)%2==0) start=mid+2;
                    else end=mid-1;
                }
            }
            return nums[mid];
        }
    }

//brute force approach
// int start=0;
//         int end=nums.length-1;
//         while(start<=end){
//             if(start<nums.length-2&&nums[start]==nums[start+1])
//                 start+=2;
//             else if(end>1&&nums[end]==nums[end-1])
//                 end-=2;
//             else if(start==end)
//                 return nums[start];
//         }
//         return -1;
}
