import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        pad("","9132");
        System.out.println(padRetList("","12"));
    }
    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int dig=up.charAt(0)-'0';
        for(int i=(dig-1)*3;i<dig*3;i++){
            if(i==26)
                continue;
            char ch =(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    public static ArrayList<String> padRetList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int dig=up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(dig-1)*3;i<dig*3;i++){
            if(i==26)
                continue;
            char ch =(char)('a'+i);
            ans.addAll(padRetList(p+ch,up.substring(1)));
        }
        return ans;
    }
}
