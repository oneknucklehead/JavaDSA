public class CapacityToShipPackagesWithinDDays {
    class Solution {
        public int shipWithinDays(int[] weights, int days) {
            int start=0,end=0;
            for(int i=0;i<weights.length;i++){
                start= Math.max(start,weights[i]);
                end+=weights[i];
            }
            while(start<end){
                int sum=0;
                int dayCount=1;
                int mid= start+(end-start)/2;
                for(int weight:weights){
                    if(sum+weight>mid){
                        sum=weight;
                        dayCount++;
                    }
                    else
                        sum+=weight;
                }
                if(dayCount>days)
                    start=mid+1;
                else
                    end=mid;

            }
            return end;
        }
    }
}
