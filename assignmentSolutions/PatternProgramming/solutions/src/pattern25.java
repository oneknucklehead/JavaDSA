public class pattern25 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            int noOfSpaces=n-i;
            for (int spaces=1;spaces<=noOfSpaces;spaces++)
                System.out.print(" ");
            for(int j=1;j<=n;j++){
                if(i==1||i==n){
                    System.out.print("*");
                }
                else{
                    if(j>1&&j<n)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
