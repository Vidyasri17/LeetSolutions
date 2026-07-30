class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int len = word.length();
        if(len <= 8) return len;
        len -= 8;
        ans += 8;
        if(len <= 8){
            ans += (len * 2);
            return ans;
        }
        ans += (8 * 2);
        len -= 8;
        if(len <= 8){
            ans += (len * 3);
            return ans;
        }
        ans += (8 * 3);
        len -= 8;
        if(len <= 8){
            ans += (len * 4);
            return ans;
        }
        ans += (8 * 4);
        len -= 8;
        return ans;
    }
}