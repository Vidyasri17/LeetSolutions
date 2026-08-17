class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 0) return 0;
        int n = nums.length;
        int left = 0;
        int pro = 1, cnt = 0;
        for(int right = 0; right < n; right++){
            pro *= nums[right];
            while(left < n && pro >= k){
                pro /= nums[left];
                left++;
            }
            cnt += (right - left + 1);
        }
        return cnt;
    }
}