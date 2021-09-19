public class CountNegativeNumbersinaSortedMatrix {
    class Solution {
        public int countNegatives(int[][] grid) {
            int sum=0;
            int indexNegative=0;
            for(int i=0;i<grid.length;i++)
            {
                indexNegative=binaryNegativeIndex(grid[i]);
                if(indexNegative!=-1)
                    sum+=grid[i].length-indexNegative;
            }
            return sum;
        }
        public int binaryNegativeIndex(int[]a){
            int start= 0;
            int end=a.length-1;
            int c=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(a[mid]<0)
                {
                    c=mid;
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            return c;
        }
    }
}
