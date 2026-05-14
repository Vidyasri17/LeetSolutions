class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxi = nums[n - 1];
        for(int i = 0; i < n; i++){
            if(i < n - 1){
                if(nums[i] != i + 1) return false;
            }
            else{
                if(nums[i] != n - 1) return false;
            }
        }
        return true;
    }
}