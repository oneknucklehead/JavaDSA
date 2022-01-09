import java.util.ArrayList;
import java.util.List;

public class CircularGame {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
    public static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(i);
        }
       return finder(list,k,0);
    }

    private static int finder(List<Integer> list, int k,int count) {
        if(list.size()==1){
            System.out.println(list.get(0));
            return list.get(0);
        }
        for(int i=0;i<list.size();i++){
            if(count==k-1){
                list.remove(i);
                count=0;
                continue;
            }
            count++;
//            if(i== list.size()-1){
//                int ans= finder(list,k,count);
//            }
        }
         return finder(list,k,count);
    }
}
