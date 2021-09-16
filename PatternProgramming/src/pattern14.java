public class pattern14 {
    public static void main(String[] args) {
        pattern(10);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            int noOfSpaces = i-1;
            for(int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print("  ");
            }
            int noOfStars=2*n-noOfSpaces-i;
            for(int star=1;star<=noOfStars;star++){
                if(i==1)
                    System.out.print("* ");
                else{
                    if(star>1&&star<noOfStars)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
