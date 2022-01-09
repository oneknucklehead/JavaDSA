public class IthBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 4;
        System.out.println(n&(1<<(i-1)));

    }
    public static int findBit(int n,int i){
        return ((n & (1 << (i - 1))) >> (i - 1));
    }
}
