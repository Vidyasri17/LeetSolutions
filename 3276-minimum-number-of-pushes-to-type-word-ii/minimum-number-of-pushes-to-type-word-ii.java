class Solution {
    public int minimumPushes(String word) {
        Integer[] freq = new Integer[26];
        Arrays.fill(freq, 0);
        for(char ch: word.toCharArray()){
            freq[ch - 'a']++;
        }
        Arrays.sort(freq, Collections.reverseOrder());
        int ans = 0;
        for(int i = 0; i < 26; i++){
            ans += freq[i] * (i / 8 + 1);
        }
        return ans;
    }
}