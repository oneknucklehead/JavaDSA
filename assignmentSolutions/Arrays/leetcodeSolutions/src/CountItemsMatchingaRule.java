public class CountItemsMatchingaRule {
    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            String[] key = {"type","color","name"};
            int position=0;
            for(int i =0;i<key.length;i++){
                if(ruleKey.equals(key[i]))
                    position=i;
            }
            int count=0;
            for(int i =0;i<items.size();i++){
                if(items.get(i).get(position).equals(ruleValue))
                    count++;
            }
            return count;
        }
    }
}
