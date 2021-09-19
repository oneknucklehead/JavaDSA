public class spiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<Integer>();
            int rows=matrix.length;
            int columns = matrix[0].length;
            int up=0;
            int left=0;
            int right=columns-1;
            int bottom=rows-1;

            while(ans.size()<rows*columns){
                for(int i=left;i<=right;i++){
                    ans.add(matrix[left][i]);
                }
                for(int i =up+1;i<=bottom;i++){
                    ans.add(matrix[i][right]);
                }
                if(up!=bottom){
                    for(int i=right-1;i>=left;i--){
                        ans.add(matrix[bottom][i]);
                    }
                }
                if(left!=right){
                    for(int i=bottom-1;i>up;i--)
                        ans.add(matrix[i][left]);
                }
                left++;
                right--;
                up++;
                bottom--;
            }
            return ans;
        }
    }
}
