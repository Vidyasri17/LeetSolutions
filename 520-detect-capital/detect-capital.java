class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) return true;
        if(word.equals(word.toLowerCase())) return true;
        char ch = word.charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            word = word.substring(1, word.length());
            if(word.equals(word.toLowerCase())) return true;
        }
        return false;
    }
}