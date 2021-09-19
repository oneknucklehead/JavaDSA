public class pattern19 {
    public static void main(String[] args) {
        pattern(8);
    }
    public static void pattern(int n){
        for(int i=1;i<2*n;i++){
            int shape=i>n?2*n-i:i;
            int noOfSpaces=2*n-2*shape;
            for(int star =1;star<=shape;star++){
                System.out.print("*");
            }
            for(int spaces=1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for(int star =1;star<=shape;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
