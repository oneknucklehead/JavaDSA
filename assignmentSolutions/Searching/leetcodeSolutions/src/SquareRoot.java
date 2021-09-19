public class SquareRoot {
    class Solution {
        public int mySqrt(int x) {
            if(x==0)
                return 0;
            long start=1;
            long end=x;

            while(start<=end){
                long middle = start+(end-start)/2;
                if(middle*middle<=x&&(middle+1)*(middle+1)>x)
                    return (int)middle;
                else if(middle*middle>x)
                    end=middle-1;
                else
                    start=middle+1;
            }
            return 0;
        }
    }
}
