public class ReverseString {
    public void reverseString(char[] s) {
        rev(s,0);
    }
    public static void rev(char[] s,int index){
        if(index==s.length/2)
            return;
        char temp=s[index];
        s[index]=s[s.length-index-1];
        s[s.length-index-1]=temp;
        rev(s,index+1);

    }
}
