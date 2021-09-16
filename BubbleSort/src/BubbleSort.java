import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] a = {1,4,3,7,-1};//we can change the values in the array or even take inputs from the user
        bubble(a);
        System.out.println(Arrays.toString(a));


    }
    static void bubble(int[] toSort){
        boolean swapped = false;
        for(int i=0;i<toSort.length;i++){
            for(int j=1;j<toSort.length-i;j++){
                if(toSort[j]<toSort[j-1])//swap if the (j)'th element is smaller than the (j-1)'th element
                {
                    int temp = toSort[j];
                    toSort[j] = toSort[j - 1];
                    toSort[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)//if the (j)'th loop does not run atleast once, it means that the array is already sorted hence swapped value will remain false
                break;
        }
    }
}
