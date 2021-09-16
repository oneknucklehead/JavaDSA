import java.util.Arrays;

public class BinarySearch_2DRowColumn {
    public static void main(String[] args) {
    int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
    };
        System.out.println(Arrays.toString(search(arr,50)));
    }
    public static int[] search(int[][] a,int target){
        int r=0;
        int c=a.length-1;
        while(r<a.length&&c>=0){
            if(a[r][c]==target)
                return new int[] {r,c};
            else if(a[r][c]<target)
                r++;
            else
                c--;
        }
        return new int[]{-1,-1};
    }
}
