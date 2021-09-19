public class FindRightInterval {
    class Solution {
        public int[] findRightInterval(int[][] intervals) {
            int check=0;
            int[] ans=new int[intervals.length];
            for(int i=0;i<intervals.length;i++)
                ans[i]=-1;
            for(int i=0;i<intervals.length;i++){
                check=intervals[i][1];
                for(int j=0;j<intervals.length;j++){
                    if(intervals[j][0]>=check){
                        if(ans[i]==-1){
                            ans[i]=j;
                        }
                        else if(ans[i]!=-1&&intervals[j][0]<intervals[ans[i]][0])
                            ans[i]=j;
                    }
                }
            }
            return ans;
        }
    }
}
