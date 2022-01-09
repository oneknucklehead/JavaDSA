public class SortedOrNot {
    public static void main(String[] args) {
        int[] a ={1,2,3,2,5,6,7};
        System.out.println(sorted(a,0));
    }
    public static boolean sorted(int[] a,int i){
        if(i==a.length-1)
            return true;
        return a[i]<a[i+1]&&sorted(a,i+1);
    }
}
