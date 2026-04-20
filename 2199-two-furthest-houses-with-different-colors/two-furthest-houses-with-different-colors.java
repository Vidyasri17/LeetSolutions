class Solution {
    public int maxDistance(int[] colors) {
        int i = 0, j = colors.length - 1;
        int ans = 0;
        while(i < j){
            if(colors[i] != colors[j]){
                ans = Math.max(ans, j - i);
                break;
            }
            else j--;
        }
        ans = Math.max(j - i, ans);
        j = colors.length - 1;
        while(i < j){
            if(colors[i] == colors[j]) i++;
            else break;
        }
        ans = Math.max(j - i, ans);
        return ans;
    }
}