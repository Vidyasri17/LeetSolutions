class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] pfSum = new int[n];
        pfSum[0] = nums[0];
        for(int i = 1; i < n; i++) pfSum[i] = pfSum[i - 1] + nums[i];
        int total = pfSum[n - 1];
        for(int i = 0; i + 1 < n; i++){
            int left = pfSum[i];
            int right = total - left;
            int diff = Math.abs(left - right);
            if(diff % 2 == 0) count++;
        }
        return count;
    }
}