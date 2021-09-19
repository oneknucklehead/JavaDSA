public class binarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,66,77,88};
        System.out.println(BS(a,1,0,a.length-1));

    }
    public static int BS(int[] a,int target,int start,int end){
        if(start>end)
            return -1;

        int mid=start+(end-start)/2;
        if(a[mid]==target)
            return mid;
        else if(target>a[mid])
            return BS(a,target,mid+1,end);
        else
            return BS(a,target,start,mid-1);
    }
}
