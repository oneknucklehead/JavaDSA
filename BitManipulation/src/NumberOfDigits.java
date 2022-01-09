//Find the number of digits in a number of any base(can be decimal(base:10), binary(base:2),  ans so on..)

public class NumberOfDigits {
    public static void main(String[] args) {
        int number = 7;
        int base = 2;
        System.out.println((int)(Math.log(number)/Math.log(base))+1);
    }
}
