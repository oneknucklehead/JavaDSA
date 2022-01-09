import java.util.ArrayList;

public class RecursiveDigitSum {
    public static void main(String[] args) {

        String n="123";
        int k=5;
        System.out.println(findSum(n,0,k));

    }
//    public static String makeString(String n,int k){
//        String processed="";
//        while(k>0){
//            processed+=n;
//            k--;
//        }
//        return processed;
//    }
    public static long findSum(String n,long sum,int k){
        int i=n.length()-1;
        while(i>=0){
            sum+=n.charAt(i)-48;
            i--;
        }
        sum*=k;
        if(sum>9){
            return findSum(sum+"",0,1);
        }
        return sum;
    }

}
