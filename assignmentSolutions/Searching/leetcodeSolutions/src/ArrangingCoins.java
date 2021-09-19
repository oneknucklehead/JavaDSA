public class ArrangingCoins {
    class Solution {
        public int arrangeCoins(int n) {
            return (int)(-0.5+(Math.sqrt(8*(double)n+1)/2));
        }
    }
}
