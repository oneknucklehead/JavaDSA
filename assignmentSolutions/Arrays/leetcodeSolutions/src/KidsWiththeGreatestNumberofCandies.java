public class KidsWiththeGreatestNumberofCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int max=Integer.MIN_VALUE;
            for(int i=0;i<candies.length;i++){
                if(candies[i]>max)
                    max=candies[i];
            }
            ArrayList<Boolean> a = new ArrayList<Boolean>();
            for(int i=0;i<candies.length;i++){

                if((candies[i]+extraCandies)>=max)
                    a.add(true);
                else
                    a.add(false);
            }
            return a;
        }
    }
}
