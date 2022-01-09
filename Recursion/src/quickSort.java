import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] a={2,5,4,7,6,3};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void quick(int[] a,int lo,int hi){
        int s=lo;
        int e=hi;
        if(lo>=hi)
            return;
        int  mid = s+(e-s)/2;
        int pivot = a[mid];
        while(s<=e){
            while(a[s]<pivot){
                s++;
            }
            while(a[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;
                e--;
            }

        }
        quick(a,lo,e);
        quick(a,s,hi);
    }
}
