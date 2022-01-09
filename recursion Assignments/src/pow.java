public class pow {
    static double ans=1;

    public static void main(String[] args) {
        System.out.println(myPow(2.1,3));
    }
    public static double myPow(double x, int n) {
        if(n==1)
            return x;
        if(n<0){
            ans=ans*(1/x)*myPow(x,n+1);
        }
        if(n>0){
            ans=ans*x*myPow(x,n-1);
        }
        return ans;
    }
}
