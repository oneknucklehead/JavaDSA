import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println(maker(4));
    }
    public static ArrayList<String> maker(int n){
        if(n==1){
            ArrayList<String> list = new ArrayList<>();
            list.add("0");
            list.add("1");
            return list;
        }
        ArrayList<String> temp =maker(n-1);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<temp.size();i++){
            ans.add("0"+temp.get(i));
        }
        for(int j= temp.size()-1;j>=0;j--){
            ans.add("1"+temp.get(j));
        }
        return ans;
    }
}
