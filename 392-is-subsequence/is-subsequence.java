class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() < 1){
            return true;
        } 
        if(s.length() > t.length()) return false;
        int j = 0;
        for(char ch: t.toCharArray()){
            if(ch == s.charAt(j)){
                j++;
            }
            if(j == s.length()) return true;
        }
        return false;
    }
}