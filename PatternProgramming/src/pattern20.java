public class pattern20 {
    public static void main(String[] args) {
        pattern(7);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                if(i==1||i==n){
                    System.out.print("*");
                }
                else{
                    if(j>1&&j<n-1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
