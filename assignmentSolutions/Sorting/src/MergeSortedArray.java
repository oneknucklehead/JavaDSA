public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int lastIndex=m+n-1;
            m--;n--;
            while(lastIndex>=0){
                if(n<0){
                    nums1[lastIndex]=nums1[m];
                    m--;
                }
                else if(m<0){
                    nums1[lastIndex]=nums2[n];
                    n--;
                }
                else if(nums1[m]>=nums2[n]){
                    nums1[lastIndex]=nums1[m];
                    m--;
                }
                else{
                    nums1[lastIndex]=nums2[n];
                    n--;
                }
                lastIndex--;
            }

        }
    }

// BRUTE FORCE
// if(n!=0){
//             int p1=0;
//             int p2=n-1;
//             while(p1<m){
//                 if(p2==-1){
//                     p2=n-1;p1++;
//                 }
//                 if(nums1[p1]<=nums2[p2])
//                     p2--;
//                 else{
//                     int temp=nums1[p1];
//                     nums1[p1]=nums2[p2];
//                     nums2[p2]=temp;
//                     p2--;
//                 }

//             }
//             for(int i=0;i<nums2.length;i++){
//                 nums1[m+i]=nums2[i];
//             }
//         }
}
