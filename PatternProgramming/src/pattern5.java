public class pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=1;i<2*n;i++){
            int noOfColumns = i>n?(2*n-i):i;
            for(int j=1;j<=noOfColumns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
