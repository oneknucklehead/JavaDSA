public class KthSymbol {
    public static void main(String[] args) {
        System.out.println(retString(1,1));
    }
    public static  int retString(int n,int k){
        if(k==1)
            return 0;
        if(k==2)
            return 1;
        int length = (int)Math.pow(2,n-2);
        if(k>length)
            return retString(n-1,k-length)==0?1:0;
        else
            return retString(n-1,k);
    }

}
