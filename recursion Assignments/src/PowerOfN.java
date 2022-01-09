public class PowerOfN {
    public static void main(String[] args) {
//        int i=1<<2;
//        int n=4;
        System.out.println(check2(1028));
    }
    public static boolean check(int n,int i){
        if(i>n)
            return false;
        if(n==i)
            return true;
        return check(n,i<<1);
    }
    public static boolean check2(int n){
        if(n==1)
            return true;
        if(n==0)
            return false;
        if(n%2==0)
            return check2(n/2);
        else
            return false;
    }
    public static boolean isPowerOfN(int n, int dig){
        if(n==1)
            return true;
        if(n==0)
            return false;
        if(n%dig==0)
            return isPowerOfN(n/dig,dig);
        else
            return false;
    }
}
