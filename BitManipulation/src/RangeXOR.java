//FInd the XOR of the numbers in a given range
public class RangeXOR {
    public static void main(String[] args) {
        //range xor for a,b = xor(a-1)^xor(b)
        int a=3;
        int b=9;
        System.out.println(xor(a-1)^xor(b));
    }
    public static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        return 0;

    }
}
