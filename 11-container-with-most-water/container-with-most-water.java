class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length - 1;
        int ans = 0;
        while(l < r){
            int ln = Math.min(h[l], h[r]);
            int bd = r - l;
            ans = Math.max(ans, ln * bd);
            if(h[l] < h[r]) l++;
            else r--;
        }
        return ans;
    }
}