class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char oddCh = ' ';
        for(char ch = 'a'; ch <= 'z'; ch++){
            int cnt = freq[ch - 'a'];
            if(cnt % 2 == 1){
                oddCh = ch;
                cnt--;
            } 
            cnt /= 2;
            while(cnt-- > 0){
                sb.append(ch);
            }
        }
        String first = sb.toString();
        StringBuilder ans = new StringBuilder(first);
        if(oddCh != ' ') ans.append(oddCh);
        ans.append(new StringBuilder(first).reverse().toString());
        return ans.toString();
    }
}