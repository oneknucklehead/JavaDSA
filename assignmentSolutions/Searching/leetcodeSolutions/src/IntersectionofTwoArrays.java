public class IntersectionofTwoArrays {
    import java.util.*;
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            boolean[] a=new boolean[1001];
            for(int num:nums1){
                a[num]=true;
            }
            int[] ans=new int[nums1.length+nums2.length];
            int k=0;
            for(int num :nums2){
                if(a[num])
                {
                    ans[k]=num;
                    a[num]=false;
                    k++;
                }
            }
            return Arrays.copyOf(ans,k);
        }
    }
}
