class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int pos = Integer.MIN_VALUE;
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    pos=j;
                    while(pos<nums2.length&&nums2[j]>=nums2[pos]){
                        pos++;
                    }
                    
                    ans[i]=pos>=nums2.length?-1:nums2[pos];
                    pos=Integer.MIN_VALUE;
                }
            }
        }
        return ans;
    }
}