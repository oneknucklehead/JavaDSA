public class RichestCustomerWealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = Integer.MIN_VALUE;
            int sum =0;


            if(accounts.length>=1&&accounts.length<=50){
                for(int i=0;i<accounts.length;i++){
                    for(int j=0;j<accounts[i].length;j++){
                        if(accounts[i].length>=1 && accounts[i].length<=50){
                            if(accounts[i][j]>=1&&accounts[i][j]<=100)
                                sum+=accounts[i][j];
                        }
                    }
                    if(sum>max)
                        max=sum;
                    sum=0;
                }
            }
            return max;
        }
    }
}
