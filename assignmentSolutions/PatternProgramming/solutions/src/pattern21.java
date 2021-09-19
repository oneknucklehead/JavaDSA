public class pattern21 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(k+"   ");
                k++;
            }
            System.out.println();
        }
    }
}
