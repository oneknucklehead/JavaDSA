public class pattern17 {
    public static void main(String[] args) {
        pattern(9);
    }
    public static void pattern(int n){
        for (int i=1;i<2*n;i++){
            int noOfSpaces = i>n?i-n:n-i;
            for(int spaces=1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            int no=i>n?i-2*noOfSpaces:i;
            int noOfCols = 2*n-1-2*noOfSpaces;
            for(int cols=1;cols<=noOfCols;cols++){
                System.out.print(no);
                if(((noOfCols/2)+1)>cols) {
                    no--;
                }
                else{
                    no++;
                }
            }
            System.out.println();
        }
    }
}
