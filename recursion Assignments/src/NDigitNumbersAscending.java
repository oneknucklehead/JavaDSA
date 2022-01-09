import java.util.ArrayList;

public class NDigitNumbersAscending {
    public static void main(String[] args) {
        System.out.println(increasingNumbers(3));
    }
    public static ArrayList<Integer> increasingNumbers(int N){
        ArrayList<Integer> al = new ArrayList<>();
        if(N==1)
            al.add(0);
        func(1,0,al,N);
        return al;
    }

    private static void func(int start, int out, ArrayList<Integer> al, int n) {
        if(n==0){
            al.add(out);
            return;
        }
        for (int i=start;i<=9;i++){
            func(i+1,(10*out)+i,al,n-1);
        }
    }
}
