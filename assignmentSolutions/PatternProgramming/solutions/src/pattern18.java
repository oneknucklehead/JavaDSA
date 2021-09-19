public class pattern18 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int noOfSpaces=0;
        for(int i=1;i<=2*n;i++){
            int shape=i>n?i-n:n-i+1;
            for(int j=1;j<=shape;j++)
                System.out.print("*");
            for(int spaces=1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            if(i<n)
                noOfSpaces+=2;
            else if(i>n)
                noOfSpaces-=2;
            for(int j=1;j<=shape;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
