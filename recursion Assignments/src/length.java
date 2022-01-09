public class length {
    public static void main(String[] args) {
        System.out.println(len("ABDS"));
    }
    public static int len(String s){
        if(s.equals("")){
            return 0;
        }
        return len(s.substring(1))+1;
    }
}
