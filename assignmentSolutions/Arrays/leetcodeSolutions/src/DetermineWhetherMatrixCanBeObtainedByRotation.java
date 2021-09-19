public class DetermineWhetherMatrixCanBeObtainedByRotation {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int count=0;
            int n=mat.length;
            while(count<4){
                if(Arrays.deepEquals(mat,target)){
                    return true;
                }
                else{
                    for(int i=0;i<n;i++){
                        for(int j=i;j<n;j++){
                            int temp=mat[i][j];
                            mat[i][j]=mat[j][i];
                            mat[j][i]=temp;
                        }
                    }
                    for(int i=0;i<n;i++){
                        for(int j=0;j<n/2;j++){
                            int tempo=mat[i][j];
                            mat[i][j]=mat[i][n-1-j];
                            mat[i][n-1-j]=tempo;
                        }
                    }
                    count++;
                }
            }
            return false;

        }
    }
}
