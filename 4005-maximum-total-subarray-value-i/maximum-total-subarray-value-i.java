class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long maxi = -1;
        long mini = Integer.MAX_VALUE;
        for(int i: nums){
            if(maxi < i) maxi = i;
            if(mini > i) mini = i;
        }
        return k * (maxi - mini);
    }
}