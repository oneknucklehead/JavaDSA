class Solution {
    public static char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        return ans(n,"0",k);
    }
    static char ans(int n,String s,int k ){
        if(n==1){
            return s.charAt(k-1);
        }
        s = s + "1"+ reverseInvert(s);
        return ans(n-1,s,k);
    }
    public static String reverseInvert(String s){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                ans.append("1");
            }
            else{
                ans.append("0");
            }
        }
        return ans.reverse().toString();
    }
}