public class KokoBananas {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int max=Integer.MIN_VALUE;
            for(int p:piles){
                max=Math.max(max,p);
            }

            if(h==piles.length)
                return max;
            int low=1;
            int high=max;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(possible(mid,h,piles)){
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            return low;

        }
        public static boolean possible(int k,int h, int[] piles){
            int timeTaken=0;
            for(int p:piles){
                timeTaken+=((p+k-1)/k);
            }
            return timeTaken<=h;

        }
    }
}
