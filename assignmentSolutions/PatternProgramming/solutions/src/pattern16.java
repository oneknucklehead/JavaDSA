//O(N) time complexity and O(1) extra space
//detailed explanation in GFG pascal's triangle method 3 by archit puri
public class pattern16 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            int noOfSpaces = n-i;
            int c=1;

            for(int spaces =1;spaces<=noOfSpaces;spaces++)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c=c*(i-j)/j;
            }
            System.out.println();
        }
    }
}
