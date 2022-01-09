public class FirstUppercase {
    public static void main(String[] args) {
        System.out.println(firstCapital("asbcdgyegiuajdhkaK"));
    }
    public static char firstCapital(String s){
        if(s.equals("")){
            char ch =' ';
            return ch;
        }
        if(s.charAt(0)>=65&&s.charAt(0)<=90){
            return s.charAt(0);
        }
         return firstCapital(s.substring(1));
    }
}
