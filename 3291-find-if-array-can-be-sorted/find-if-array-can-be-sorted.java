class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int j = i;
            int bits = Integer.bitCount(nums[i]);
            while(j < n && Integer.bitCount(nums[j]) == bits){
                j++;
            }
            Arrays.sort(nums, i , j);
            i = j;
        }
        for(int k = 1; k < n; k++){
            if(nums[k - 1] > nums[k]) return false;
        }
        return true;
    }
}