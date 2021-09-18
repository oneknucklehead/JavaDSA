public class pattern24 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
            for(int i=1;i<=2*n;i++) {
                int shape=i>n?2*n-i+1:i;
                int noOfSpaces=2*n-shape*2;
                for(int star=1;star<=shape;star++){
                    if (star>1&&star<shape)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                for(int space=1;space<=noOfSpaces;space++)
                    System.out.print(" ");
                for(int star=1;star<=shape;star++){
                    if (star>1&&star<shape)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }

                System.out.println();
            }
    }
}