public class CountSetBits {
    public static void main(String[] args) {
        int n=111100;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    public static int setBits(int n){
        //WAY 1
        int count=0;
        while(n>0){
            n-=n&-n;
            count++;
        }
        return count;
    }
    public static int setBits2(int n){
        //WAY 2
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
