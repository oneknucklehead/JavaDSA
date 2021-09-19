public class FairCandySwap {
    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            Arrays.sort(aliceSizes);
            Arrays.sort(bobSizes);
            int sumA = 0,sumB = 0;
            for(int a : aliceSizes) sumA += a;
            for(int b : bobSizes)   sumB += b;

            int i=0, j=0;
            int[] res = new int[2];
            while(i<aliceSizes.length && j<bobSizes.length){
                int tempA = sumA - aliceSizes[i] + bobSizes[j];
                int tempB = sumB - bobSizes[j] + aliceSizes[i];
                if(tempA == tempB) {
                    res[0] = aliceSizes[i];
                    res[1] = bobSizes[j];
                    break;
                }else if(tempA > tempB){
                    i++;
                }else{
                    j++;
                }
            }
            return res;
        }
    }
}
