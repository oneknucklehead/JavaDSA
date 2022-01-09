public class PowerOfARaisedToB {
    public static void main(String[] args) {
        int ans=1;
        int base=3;
        int pow = 3;
        while(pow!=0){
            if((pow&1)==1){
                ans*=base;
            }
            base*=base;
            pow=pow>>1;
        }
        System.out.println(ans);

    }
}
