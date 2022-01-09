import java.util.ArrayList;
import java.util.Collections;

public class PowerSetLexicographically {
    public static void main(String[] args) {
        ArrayList<String> ans = power("","abc");
        Collections.sort(ans);

        System.out.println(ans);
    }
    public static ArrayList<String> power(String p,String up){
        if(up.isEmpty()){
            if(p.isEmpty()==false) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            else
                return new ArrayList<>();
        }
        char ch = up.charAt(0);
        ArrayList<String> left = power(p+ch,up.substring(1));
        ArrayList<String> right = power(p,up.substring(1));
        left.addAll(right);
        return left;

    }
}
