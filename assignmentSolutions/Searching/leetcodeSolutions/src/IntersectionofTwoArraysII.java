public class IntersectionofTwoArraysII {
    import java.util.*;
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            int[] a=new int[1001];

            for(int num:nums1){
                a[num]++;
            }
            int[] ans=new int[nums1.length+nums2.length];
            int k=0;
            for(int num :nums2){
                if(a[num]>0)
                {
                    ans[k]=num;
                    a[num]--;
                    //a[num]=false;
                    k++;
                }
            }
            return Arrays.copyOf(ans,k);

        }
    }
}

