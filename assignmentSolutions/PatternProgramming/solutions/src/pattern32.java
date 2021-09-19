public class pattern32 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){

        for (int i=1;i<=n;i++){
            int ch=65+n;
            for (int j=i;j>=1;j--){
                System.out.print((char)(ch-j)+" ");
            }
            System.out.println();
        }
    }
}
