public class PowerSumHackerrank {
    public static void main(String[] args) {
        int num=100;
        int power =3;
        System.out.println(countPowerSum(num,power,1,0,0));
    }
    public static int countPowerSum(int num,int power,int curr,int carriedSum,int count){
        int sum = carriedSum+(int)Math.pow(curr,power);
        if(sum==num){
            return 1;
        }
        if(sum>num){
            return 0;
        }
        count+=countPowerSum(num,power,curr+1,sum,count)+countPowerSum(num,power,curr+1,carriedSum,count);
        return count;
    }
}
