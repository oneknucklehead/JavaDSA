//same as pattern 7 with a space after the star we are printing
public class pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            int noOfSpaces = i-1;
            for(int space=1;space<=noOfSpaces;space++){
                System.out.print(" ");
            }
            for (int star=n;star>=i;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
