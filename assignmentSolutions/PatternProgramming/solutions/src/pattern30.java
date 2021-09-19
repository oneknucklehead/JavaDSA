public class pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            int noOfSpaces=n-i;
            for (int spaces=1;spaces<=noOfSpaces;spaces++){
                System.out.print("  ");
            }
            int noOfColumns=2*i-1;
            int mid=(noOfColumns/2)+1;
            int toPrint=i;
            for(int cols=1;cols<=noOfColumns;cols++){
                System.out.print(toPrint+" ");
                if(cols<mid)
                    --toPrint;
                else
                    ++toPrint;
            }
            System.out.println();
        }
    }
}
