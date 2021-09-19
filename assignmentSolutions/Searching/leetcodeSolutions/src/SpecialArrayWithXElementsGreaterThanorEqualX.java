public class SpecialArrayWithXElementsGreaterThanorEqualX {
    class Solution {
        public int specialArray(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            int largest = nums[len-1];
            int ans=0;
            int x=0;
            while(x<=largest){
                int pos = binarySearch(nums,0,len-1,x);
                ans=len-pos;
                if(ans==x)
                    break;
                if(x==largest&&ans!=x)
                {
                    ans=-1;
                    break;
                }
                x++;
            }
            return ans;

        }
        public int binarySearch(int[] a,int s, int e,int target){
            int ans=-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(a[m]==target)
                {
                    ans=m;
                    e=m-1;
                }
                else if(target<a[m])
                    e=m-1;
                else
                    s=m+1;
            }
            if(ans!=-1)
                return ans;
            else
                return s;
        }
    }
}
