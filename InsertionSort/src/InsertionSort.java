import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {1,5,2,6,3};
        Insertion(a);
        System.out.println(Arrays.toString(a));
    }
    static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
    static void swap(int[] a,int first, int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
