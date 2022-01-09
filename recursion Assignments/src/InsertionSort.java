import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={5,3,4,2,5};
        insertion(a,0,1);
        System.out.println(Arrays.toString(a));
    }
    public static void insertion(int[] a,int r,int c){
        if(r==a.length-1){
            return;
        }
//        int c=r+1;
        if(c>0){
            if(a[c]<a[c-1]){
                swap(a,c,c-1);
            }
            insertion(a,r,c-1);
        }
        else
            insertion(a,r+1,r+2);


    }

    private static void swap(int[] a, int c, int i) {
        int temp = a[c];
        a[c]=a[i];
        a[i]=temp;
    }
}
