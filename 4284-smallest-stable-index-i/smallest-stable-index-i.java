class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] mins = new int[n];
        int mini = nums[n - 1];
        for(int i = n - 1; i >= 0; i--){
            mini = Math.min(mini, nums[i]);
            mins[i] = mini;
        }
        int maxi = nums[0];
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, nums[i]);
            int instability = maxi - mins[i];
            if(instability <= k) return i;
        }
        return -1;
    }
}