class Solution {
    public int maximumLengthSubstring(String s) {
        int len = 0;
        int left = 0, right = 0;
        int[] freq = new int[26];
        while(right < s.length()){
            char ch = s.charAt(right);
            freq[ch - 'a']++;
            while(freq[ch - 'a'] > 2){
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                left++;
            }
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}