import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fibonacciSpecial
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            long n=in.nextLong();
            System.out.println(fun(a,b,n));
        }
    }
    public static long fun(long a,long b,long n){
        if(n==0){
            return a;
        }
        if(n==1){
            return b;
        }
        if(n==2){
            return a^b;
        }
        return fun(a,b,n%3);
    }
}