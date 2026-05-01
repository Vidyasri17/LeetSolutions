class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            dp[0] += i * (nums[i]);
        }
        int maxi = dp[0];
        for(int k = 1; k < n; k++){
            dp[k] = dp[k - 1] + sum - n * nums[n - k];
            maxi = Math.max(maxi, dp[k]);
        }
        return maxi;
    }
}