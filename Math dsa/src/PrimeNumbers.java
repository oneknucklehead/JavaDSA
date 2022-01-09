public class PrimeNumbers {
    public static void main(String[] args) {
//        System.out.println(isPrime(5));
        for(int i=1;i<=20;i++){
            System.out.println(i+" is prime? : "+isPrime(i));
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }
}
