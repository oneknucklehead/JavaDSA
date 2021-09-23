public class PeakElementII {
    class Solution {
        public int[] findPeakGrid(int[][] mat) {
            int i = mat.length / 2;
            int j = mat[0].length / 2;

            while (true) {
                int centre = mat[i][j];
                int up = i > 0 ? mat[i - 1][j] : -1;
                int down = i < mat.length - 1 ? mat[i + 1][j] : -1;
                int left = j > 0 ? mat[i][j - 1] : -1;
                int right = j < mat[0].length - 1 ? mat[i][j + 1] : -1;

                if (left > centre) {
                    j--;
                } else if (right > centre) {
                    j++;
                } else if (up > centre) {
                    i--;
                } else if (down > centre) {
                    i++;
                } else {
                    return new int[] {i, j};
                }
            }
        }
    }
}
