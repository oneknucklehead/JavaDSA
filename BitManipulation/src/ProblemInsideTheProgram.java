//You are given a number, find out if it is a power of 2 or not

public class ProblemInsideTheProgram {
    public static void main(String[] args) {
        // in the below approach, 0 is an exception thus take an if else case for that
        int n=17;
        boolean ans = (n&(n-1))==0;
        System.out.println(ans);
    }
}


//        BRUTE FORCE
//        int n=8;
//        int count=0;
//        while(n!=0){
//                int last = n&1;
//                if(last==1)
//                count++;
//                n=n>>1;
//                }
//                if(count%2==0)
//                System.out.println("it is a power of 2");
//                else
//                System.out.println("it is not a power of 2");