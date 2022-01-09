import java.util.*;
public class Factors {
    public static void main(String[] args) {
        factors(20);
    }
    public static void factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if((n/i)==i)
                    System.out.print(i+" ");
                else{
                    System.out.print(i+" ");
                    list.add(0,n/i);
                }
            }
        }
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j)+" ");
        }
    }
}
