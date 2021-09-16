public class pattern8 {
    public static void main(String[] args) {
        pattern(8);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            int noOfSpaces = n-i;
            for(int space=1;space<=noOfSpaces;space++){
                System.out.print(" ");
            }
            int noOfStars = 2*n-2*noOfSpaces-1;
            for (int star=1;star<=noOfStars;star++)
                System.out.print('*');
            System.out.println();
        }
    }
}
