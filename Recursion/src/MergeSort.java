import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a ={5,4,7,2,6,2,8};
        a=mergeSort(a);

        System.out.println(Arrays.toString(a));
    }
    public static int[] mergeSort(int[]a){
        if(a.length==1)
            return a;
        int mid= a.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(a,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(a,mid,a.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i=0,j=0,k=0;
        int[] mix = new int[left.length+right.length];
        while (i<left.length&&j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else
            {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            k++;i++;
        }
        while(j<right.length){
            mix[k]=right[j];
            k++;j++;
        }
        return mix;
    }
}
