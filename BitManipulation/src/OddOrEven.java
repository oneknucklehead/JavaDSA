public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(isOdd(4));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
