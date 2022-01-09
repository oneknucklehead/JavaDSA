public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String s ="asdasdasd";
        System.out.println(check(s));
    }
    public static String check(String s){
        if(s.length()<=1)
            return s;
        if(s.charAt(0)==s.charAt(1)){
            return check(s.substring(1));
        }
        else
            return s.charAt(0)+check(s.substring(1));
    }
}
