public class CheckiftheSentenceIsPangram {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            int[] a= new int[26];
            sentence=sentence.toLowerCase().trim();
            for(int i =0;i<sentence.length();i++){
                int ch = (int)sentence.charAt(i);
                a[ch-97]++;
            }
            for(int i=0;i<26;i++){
                if(a[i]==0)
                    return false;
            }
            return true;
        }
    }
}
