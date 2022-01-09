//Find the non unique element
//E.g: [2,4,3,4,3,2,6]
//output: 6
public class uniqueElement {
    public static void main(String[] args) {
        int[] a = {2,4,3,3,4,2,6};

        System.out.println(unique(a));
    }
    public static int unique(int[] a){
        int ans =0;
        for(int n : a){
            ans^=n;
        }
        return ans;
    }
}
