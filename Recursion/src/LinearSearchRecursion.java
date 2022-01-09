import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] a={1,4,56,3,3,9,7,3};
        int target=3;
//        System.out.println(linearSearch(a,0,target));
//        findAllIndex(a,0,target);
//        System.out.println(list);
        ArrayList<Integer> list = findIndexList(a,0,3,new ArrayList<>());
        System.out.println(list);
    }
    public static int linearSearch(int[] a , int i,int target){
        if(i>=a.length)
            return -1;
        if(a[i]==target)
            return i;
        else
            return linearSearch(a,i+1,target);
    }

    //linearSearch to find all occurrences of the target
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] a,int i,int target){
        if(i==a.length)
            return;
        if(a[i]==target)
            list.add(i);

        findAllIndex(a,i+1,target);

    }
    //return arraylist directly without using static variables
    public static ArrayList<Integer> findIndexList(int[] a,int i,int target,ArrayList<Integer> list){
        if(i==a.length)
            return list;
        if(a[i]==target)
            list.add(i);
        return findIndexList(a,i+1,target,list);
    }
}
