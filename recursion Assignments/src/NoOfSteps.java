public class NoOfSteps {
    public static void main(String[] args) {
        System.out.println(check(32767,0));
    }
    public static int check(int num,int count){
        if(num<=0)
            return count;
        if((num&1)==0)
            return check(num/2,count+1);
        else
            return check(num-1,count+1);
    }
}
