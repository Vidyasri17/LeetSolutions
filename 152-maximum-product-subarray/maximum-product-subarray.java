class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currMax = 1, currMin = 1;
        int res = nums[0];
        for(int num: nums) res = Math.max(num, res);
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                currMax = 1;
                currMin = 1;
            }
            else{
                int temp = nums[i] * currMax;
                currMax = Math.max(nums[i] * currMax, Math.max(nums[i] * currMin, nums[i]));
                currMin = Math.min(temp, Math.min(nums[i] * currMin, nums[i]));
                res = Math.max(currMax, res);
            }
        }
        return res;
    }
}

