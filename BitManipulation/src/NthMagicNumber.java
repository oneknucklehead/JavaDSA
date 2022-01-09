public class NthMagicNumber {
    public static void main(String[] args) {
        int n=3;
        int ans=0;
        int count=1;
        while(n>0){
            int last =n&1;
            n=n>>1;
            ans=ans+(last*(int)Math.pow(5,count));
            count++;
        }
        System.out.println(ans);
    }
}
