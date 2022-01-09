import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a ={5,4,6,2,7,6};
        bubble(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    public static void bubble(int[] a,int r,int c){
        if(r==0)
            return;
        if(c<r){
            if(a[c]>a[c+1]){
                swap(a,c,c+1);
            }
            bubble(a,r,c+1);
        }
        else
            bubble(a,r-1,0);
    }

    private static void swap(int[] a, int c, int i) {
        int temp = a[c];
        a[c]=a[i];
        a[i]=temp;
    }

}
