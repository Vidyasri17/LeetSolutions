class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        for(int i = 0; i < words.length; i++){
            boolean all = true;
            for(char ch: words[i].toCharArray()){
                if(!allowed.contains("" + ch)){
                    all = false;
                    break;
                }
            }
            if(all) cnt++;
        }
        return cnt;
    }
}