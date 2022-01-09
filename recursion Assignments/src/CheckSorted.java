public class CheckSorted {
    public static void main(String[] args) {
        int[] a={1,2,3,6,5};
        System.out.println(check(a,1));
    }
    public static boolean check(int[] a,int i){
        if(i==a.length)
            return true;
        if(a[i]>a[i-1])
            return check(a,i+1);
        else
            return false;
    }
}
