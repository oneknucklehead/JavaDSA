public class MedianOfSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Integer> merged = new ArrayList<>();
            int i=0,j=0;
            while(i<nums1.length&&j<nums2.length){
                if(nums1[i]<nums2[j]){
                    merged.add(nums1[i]);
                    i++;
                }
                else if(nums1[i]>nums2[j]){
                    merged.add(nums2[j]);
                    j++;
                }
                else{
                    merged.add(nums1[i]);
                    merged.add(nums2[j]);
                    i++;j++;
                }
            }
            if(i<nums1.length){
                while(i<nums1.length){
                    merged.add(nums1[i]);
                    i++;
                }
            }
            if(j<nums2.length){
                while(j<nums2.length){
                    merged.add(nums2[j]);
                    j++;
                }
            }
            double median=0;
            int l = merged.size();
            if(l%2==0){
                median = (double)(merged.get(l/2)+merged.get(l/2-1))/2;
            }
            else{
                median = (double)(merged.get(l/2));
            }
            return median;
        }
    }
}
