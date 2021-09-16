public class pattern15 {
    public static void main(String[] args) {
        pattern(10);
    }
    public static void pattern(int n){
        for(int i=1;i<2*n;i++){
            int noOfSpaces=i>n?i-n:n-i;
            for(int spaces =1;spaces<=noOfSpaces;spaces++)
                System.out.print(" ");
            int noOfStars=2*n-2*noOfSpaces-1;
            for (int star=1;star<=noOfStars;star++){
                if(star>1&&star<noOfStars)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
