public class SaddlePointInMatrix {
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> ans = new ArrayList<Integer>();
            for(int i=0;i<matrix.length;i++){
                int colIndex = minInRow(matrix,i);
                int value=matrix[i][colIndex];
                if(maxInColumn(matrix,colIndex,value))
                    ans.add(value);
            }
            return ans;
        }
        public int minInRow(int[][] a,int rowIndex){
            int min = 0;
            for(int i=0;i<a[rowIndex].length;i++){
                if(a[rowIndex][min]>a[rowIndex][i])min=i;
            }
            return min;
        }
        public boolean maxInColumn(int a[][],int colIndex,int value){
            for(int i=0;i<a.length;i++){
                if(value<a[i][colIndex])return false;
            }
            return true;
        }

    }
}
