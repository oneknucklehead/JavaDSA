import java.util.Arrays;
//O(logn+logm) time complexity
public class BinarySearch2DSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        System.out.println(Arrays.toString(search(arr,17)));
    }
    //function to search between the column start and end provided in a particular row
    public static int[] binarySearch2D(int[][] a,int rno,int columnStart,int columnEnd,int target){
        while(columnStart<=columnEnd){
            int mid=columnStart+(columnEnd-columnStart)/2;
            if(a[rno][mid]==target)
                return new int[]{rno,mid};
            else if(target>a[rno][mid])
                columnStart=mid+1;
            else
                columnEnd=mid-1;
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        //if only one row is present
        if(rows==1)
            return binarySearch2D(matrix,0,0,cols-1,target);
        int rStart =0;
        int rEnd = rows-1;
        int cMid = cols/2;
        //running the loop until only two rows are left to search
        while(rStart<(rEnd-1)){
            int mid = rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target)
                return new int[]{mid,cMid};
            if(target>matrix[mid][cMid])
                rStart=mid;
            else
                rEnd=mid;
        }
        //searching for the element in the remaining two rows

        //if the mid element of the remaining two rows are the target
        if(matrix[rStart][cMid]==target)
            return new int[]{rStart,cMid};
        if(matrix[rStart+1][cMid]==target)
            return new int[]{rEnd,cMid};

        //searching in first part of the array
        if(target<=matrix[rStart][cMid]-1)
            return binarySearch2D(matrix,rStart,0,cMid-1,target);
        //searching in second part of the array
        if(target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][cols-1])
            return binarySearch2D(matrix,rStart,cMid+1,cols-1,target);
        //searching in third part of the array
        if(target<=matrix[rStart+1][cMid-1])
            return binarySearch2D(matrix,rStart+1,0,cMid-1,target);
        else
            return binarySearch2D(matrix,rStart+1,cMid+1,cols-1,target);
    }
}
