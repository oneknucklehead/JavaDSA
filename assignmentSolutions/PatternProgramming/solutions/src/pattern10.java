//same as pattern 6 but with a space after the start we are printing
public class pattern10 {
    public static void main(String[] args) {
        pattern(8);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            int noOfSpaces = n-i;
            for(int space=1;space<=noOfSpaces;space++){
                System.out.print(" ");
            }
            for (int star=1;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
