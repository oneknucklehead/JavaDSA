import java.util.ArrayList;
import java.util.List;

public class PredictWinner {
    public static void main(String[] args) {
        int[] a = {1,5,233,7};
        List<Integer> arr = new ArrayList<>();
        for (int j : a) {
            arr.add(j);
        }
        System.out.println(winner(arr,0,0,1));
//        winner(arr,0,0,1);
    }
    public static boolean winner(List<Integer> nums,int sum1,int sum2,int firstPlayerToggle){
        if(nums.isEmpty()){
            return sum1 >= sum2;
        }
//        boolean ans=false;
        if(firstPlayerToggle==1){
            firstPlayerToggle=0;
            List<Integer> list1 = nums.subList(1,nums.size());
            List<Integer> list2 = nums.subList(0,nums.size()-1);
            return winner(list1,sum1+nums.get(0),sum2,firstPlayerToggle)&& winner(list2,sum1+nums.get(nums.size()-1),sum2,firstPlayerToggle);
        }
        else {
            firstPlayerToggle=1;
            List<Integer> list1 = nums.subList(1,nums.size());
            List<Integer> list2 = nums.subList(0,nums.size()-1);
            return winner(list1,sum1,sum2+nums.get(0),firstPlayerToggle)&&winner(list2,sum1,sum2+nums.get(nums.size()-1),firstPlayerToggle);
        }
    }
}
