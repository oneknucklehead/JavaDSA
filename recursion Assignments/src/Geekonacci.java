import java.util.Scanner;

public class Geekonacci {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("No of test cases:");
//        int t = sc.nextInt();
//        while(t>0){
//            System.out.println("Enter the test cases:");
//            int a= sc.nextInt();
//            int b=sc.nextInt();
//            int c= sc.nextInt();
//            int n = sc.nextInt();
////            System.out.println(a+" "+b+" "+c+" "+n);
//            --t;
//        }
        System.out.println(geek(1,3,2,5));
    }
    public static int geek(int a,int b,int c,int n){
        if(n==1){
            return a;
        }
        if(n==2)
            return b;
        if(n==3)
            return c;
        return geek(a,b,c,n-1)+geek(a,b,c,n-2)+geek(a,b,c,n-3);
    }
}
