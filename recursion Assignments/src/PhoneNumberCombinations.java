import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombinations {
    public static void main(String[] args) {
        System.out.println(maker("",""));
    }
//    public List<String> letterCombinations(String digits) {
//
//    }
    public static List<String> maker(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(p.equals("")){
                return list;
            }
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int dig = up.charAt(0)-'0';
        int start=dig==8||dig==9?(dig-2)*3+1:(dig-2)*3;
        int end = dig==7||dig==8?(dig-1)*3+1:dig==9?(dig-1)*3+2:(dig-1)*3;
        for(int i=start;i<end;i++){
            char ch = (char)('a'+i);
            ans.addAll(maker(p+ch,up.substring(1)));
        }
        return ans;
    }
}
