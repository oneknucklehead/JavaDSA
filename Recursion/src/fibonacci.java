//Time complexity: O(((Math.sqrt(5)+1)/2)^2) or O(golden number to the power of n) or exponential time complexity
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(6));

    }
    public static int fib(int n){
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
