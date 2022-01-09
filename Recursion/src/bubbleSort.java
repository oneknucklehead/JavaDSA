public class bubbleSort {
    public static void main(String[] args) {
        int[] a ={4,2,3,5,7,9};
        bubble(a,a.length-1,0);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void bubble(int[] a , int r, int c){
        if(r==0)
            return;
        if(c<r){
            if(a[c]>a[c+1]){
                swap(a, c,c+1);
            }
            bubble(a,r,c+1);
        }
        else{
            bubble(a,r-1,0);
    }
}

    private static void swap(int[] a,int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;
    }
    }
