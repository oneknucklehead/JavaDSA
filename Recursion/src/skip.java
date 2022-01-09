//Given any arbitrary string, remove all the occurences of 'a' from the string

public class skip {
    public static void main(String[] args) {
        System.out.println(skipLetters2("bcaadadc"));
        skipLetters("","bacdhabaacg");
    }
    public static void skipLetters(String p,String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='a'){
            skipLetters(p,up.substring(1));
        }
        else
        {
            skipLetters(p+ch,up.substring(1));
        }
    }
    public static String skipLetters2(String up){
        if(up.isEmpty())
            return "";
        char ch = up.charAt(0);
        if(ch=='a')
            return skipLetters2(up.substring(1));
        else
            return ch + skipLetters2(up.substring(1));
    }
}
