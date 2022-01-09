public class MaxMin {
    public static void main(String[] args) {
        int[] a={1, 4, 3, -5, -4, 8, 6};
        maxMin(a,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static void maxMin(int[] a, int index,int max , int min){
        if(index==a.length){
            System.out.println("min= "+min+", max= "+max);
            return;
        }
        if(a[index]>max){
            max=a[index];
        }
        if(a[index]<min){
            min=a[index];
        }
        maxMin(a,index+1,max,min);
    }
}
