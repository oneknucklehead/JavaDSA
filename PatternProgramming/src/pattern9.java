public class pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            int noOfSpaces = i-1;
            for(int space=1;space<=noOfSpaces;space++){
                System.out.print("  ");
            }
            int noOfStar = 2*n-noOfSpaces-i;
            for(int star=1;star<=noOfStar;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
