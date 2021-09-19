public class pattern22 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int toggle=0;
        for(int i=1;i<=n;i++){
            toggle=i%2==0?1:0;
            for(int j=1;j<=i;j++){
                toggle=toggle==0?1:0;
                System.out.print(toggle);
            }
            System.out.println();
        }
    }
}
