class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int val = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            val += i * (nums[i]);
        }
        int maxi = val;
        for(int k = 1; k < n; k++){
            int temp = val + sum - n * nums[n - k];
            maxi = Math.max(maxi, temp);
            val = temp;
        }
        return maxi;
    }
}