public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            int noOfSpaces = n-i;
            for(int space=1;space<=noOfSpaces;space++){
                System.out.print(" ");
            }
            for (int star=1;star<=i;star++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
