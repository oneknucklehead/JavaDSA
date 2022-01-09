public class PrintNos {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int N){
        if(N==1){
            System.out.println(N);
            return;
        }
        print(N-1);
        System.out.println(N);

    }
}
