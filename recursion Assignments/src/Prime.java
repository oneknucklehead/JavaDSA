public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(11,2));
    }
    public static boolean prime(int n,int i){
        if(n<=2)
            return n==2?true:false;
        if(n%i==0)
            return false;
        if(n<i*i)
            return true;

        return prime(n,i+1);
    }
}
