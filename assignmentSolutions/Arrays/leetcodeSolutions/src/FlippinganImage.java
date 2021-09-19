public class FlippinganImage {
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            int[][] a = new int[image.length][image.length];
            for(int i =0;i<image.length;i++){
                for(int j=image[i].length-1;j>=0;j--){
                    a[i][image[i].length-j-1]=(image[i][j]==0?1:0);
                }
            }
            // for(int i=0;i<a.length;i++){
            //     for(int j=0;j<a[i].length;j++){
            //         if(a[i][j]==0)
            //             a[i][j]=1;
            //         else
            //             a[i][j]=0;
            //     }
            // }
            return a;
        }
    }
}
