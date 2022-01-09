public class BalancedParenthesis {
    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
        char[] ch = exp.toCharArray();
        System.out.println(check(ch,0,0));
    }
    public static boolean check(char[] ch,int index,int count){
        if(index==ch.length&&count==0)
            return true;
        if(index==ch.length&&count!=0)
            return false;
        if(ch[index]=='['||ch[index]=='{'||ch[index]=='(')
            return check(ch,index+1,count+1);
        else if(ch[index]=='}'||ch[index]==']'||ch[index]==')')
            return check(ch,index+1,count-1);
        else
            return false;
    }
}
