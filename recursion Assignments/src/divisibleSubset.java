import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class divisibleSubset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int num:arr){
            ans.add(num);
        }
//        System.out.println(ans);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        ArrayList<ArrayList<Integer>> subseq = possiblesubset(arr);
        for(int i=0;i<subseq.size();i++){
            if(sum(subseq.get(i),arr.length)){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0;j<subseq.get(i).size();j++){
                    int pos=ans.indexOf(subseq.get(i).get(j));
                    temp.add(pos+1);
                }
                temp.add(0,subseq.get(i).size());
                output.add(temp);
            }
        }
        System.out.println(subseq);
        System.out.println(output);
    }
    public static ArrayList<ArrayList<Integer>> possiblesubset(int[] arr){
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       list.add(new ArrayList<>());
       for(int num:arr){
           int n=list.size();
           for(int i=0;i<n;i++){
               ArrayList<Integer> internal = new ArrayList<>(list.get(i));
               internal.add(num);
               list.add(internal);
           }
       }
       return list;
    }
    public static boolean sum(ArrayList<Integer> list,int size){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum%size==0;
    }
}
