import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]==arr[correctIndex])
                i++;
            else
                swap(arr,i,correctIndex);
        }
    }
    static void swap(int[] a,int first,int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
