class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean allZeroes = true;
        for(int i: nums){
            xor = xor ^ i;
            if(i != 0 && allZeroes) allZeroes = false;
        }
        if(xor > 0) return nums.length;
        if(allZeroes) return 0;
        return nums.length - 1;

    }
}