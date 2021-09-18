public class pattern33 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        boolean isLower=true;
        int ch=97;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(isLower){
                    System.out.print((char)ch+" ");
                }
                else{
                    System.out.print((char)(ch-32)+" ");
                }
                isLower=!isLower;
                ch++;
            }
            System.out.println();
        }
    }
}
