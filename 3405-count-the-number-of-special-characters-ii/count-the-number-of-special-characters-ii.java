class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(map.containsKey(ch)){
                if(ch >= 'a' && ch <= 'z'){
                    map.put(ch, i);
                }
                else{
                    continue;
                }
            }
            else{
                map.put(ch, i);
            }
        }
        int cnt = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(map.containsKey(ch) && map.containsKey((char)(ch - 32))){
                int lcInx = map.get(ch);
                int ucInx = map.get((char)(ch - 32));
                if(lcInx < ucInx) cnt++;
            }
        }
        return cnt;
    }
}