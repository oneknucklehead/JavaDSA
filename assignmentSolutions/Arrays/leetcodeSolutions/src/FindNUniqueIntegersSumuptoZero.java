public class FindNUniqueIntegersSumuptoZero {
    class Solution {
        public int[] sumZero(int n) {
            int[] a = new int[n];
            int k=n/2;
            a[k]=0;
            for(int i=0;i<n/2;i++){
                a[i]=-k;
                a[n-i-1]=k;
                k--;
            }
            return a;
        }
    }
}
