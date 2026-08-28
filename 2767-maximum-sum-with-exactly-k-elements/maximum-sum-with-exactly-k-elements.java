class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        for(int num: nums) maxi = Math.max(maxi, num);
        int sum = 0;
        while(k-- > 0) sum += maxi++;
        return sum;
    }
}