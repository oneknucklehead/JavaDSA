import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] a ={5,4,7,2,6,2,8};
        mergeSort(a,0,a.length);

        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int[]a,int s,int e){
        if((e-s)==1)
            return;
        int mid= (s+e)/2;
        mergeSort(a,s,mid);
        mergeSort(a,mid,e);

        mergeInPlace(a,s,mid,e);
    }

    private static void mergeInPlace(int[] a, int s,int m,int e) {
        int i=s,j=m,k=0;
        int[] mix = new int[e-s];
        while (i<m&&j<e){
            if(a[i]<a[j]){
                mix[k]=a[i];
                i++;
            }
            else
            {
                mix[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=a[i];
            k++;i++;
        }
        while(j<e){
            mix[k]=a[j];
            k++;j++;
        }
        for (int l=0;l<mix.length;l++){
            a[s+l]=mix[l];
        }
    }
}
