import java.util.ArrayList;
import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        sumTriangle(a);
    }
    public static void sumTriangle(int[] arr){
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] a = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            a[i-1]=arr[i]+arr[i-1];
        }
        sumTriangle(a);
        System.out.println(Arrays.toString(arr));
    }
}
