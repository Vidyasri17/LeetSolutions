class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(char ch: word.toCharArray()) set.add(ch);
        int cnt = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(set.contains(ch) && set.contains((char)(ch - 32))) cnt++;
        }
        return cnt;
    }
}