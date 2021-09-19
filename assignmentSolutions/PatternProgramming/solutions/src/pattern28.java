public class pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for (int i=1;i<2*n;i++){
            int noOfColumns=i>n?2*n-i:i;
            int noOfSpaces=n-noOfColumns;
            for (int spaces=1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=noOfColumns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
