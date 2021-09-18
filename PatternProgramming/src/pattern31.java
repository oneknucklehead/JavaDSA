public class pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
        for (int rows=1;rows<2*n;rows++){
            for (int cols=1;cols<2*n;cols++){
                int toPrint= n-Math.min(Math.min(cols-1,2*n-cols-1),Math.min(rows-1,2*n-rows-1));
                System.out.print(toPrint+" ");
            }
            System.out.println();
        }
    }
}
