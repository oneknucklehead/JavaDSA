public class pattern29 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for (int i=1;i<2*n;i++){
            int noOfStars = i>n?2*n-i:i;
            for(int stars=1;stars<=noOfStars;stars++){
                System.out.print("*");
            }
            int noOfSpaces=2*n-2*noOfStars;
            for (int spaces=1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=noOfStars;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
