class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0, maxIndex = 0;
        for(int i = 0; i < n; i++){
            if(nums[maxIndex] < nums[i]) maxIndex = i;
            if(nums[minIndex] > nums[i]) minIndex = i;
        }
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        int s1 = left + 1 + n - right;
        int s2 = right + 1;
        int s3 = n - left;
        return Math.min(s1, Math.min(s2, s3));
    }
}