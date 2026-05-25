class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCnt = 0;
        int n = nums.length;
        int maxLen = 0;
        for(int right = 0; right < n; right++){
            if(nums[right] == 0){
                zeroCnt++;
            }
            while(zeroCnt > 1){
                if(nums[left] == 0) zeroCnt--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}
