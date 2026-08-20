class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int ans = 0;
        int i = Math.max(1, n - k);
        while(i <= n + k){
            int diff = Math.abs(n - i);
            if(diff <= k && (n & i) == 0){
                ans += i;
            }
            i++;
        }
        return ans;
    }
}