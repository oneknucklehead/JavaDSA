public class Product {
    public static void main(String[] args) {
        System.out.println(prod(3,1));
    }
    public static int prod(int x,int y){
        if(x<y){
            return prod(y,x);
        }
        if(y!=0){
            return x+prod(x,y-1);
        }
        else
            return 0;
    }
}
