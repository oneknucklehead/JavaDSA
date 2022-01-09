public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] a = {1,3,4,6,7,88,99};
        System.out.println(binarySearch(a,0,a.length-1,100));

    }
    public static int binarySearch(int[] arr,int s, int e,int target){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target)
            return m;
        if(arr[m]<target)
            return binarySearch(arr,m+1,e,target);
        return binarySearch(arr,s,m-1,target);
    }
}
