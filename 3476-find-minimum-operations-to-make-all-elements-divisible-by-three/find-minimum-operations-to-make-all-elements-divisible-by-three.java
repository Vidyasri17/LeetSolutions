class Solution {
    public int minimumOperations(int[] nums) {
        int rem = 0;
        int minm = 0;
        for(int i: nums){
            rem = i % 3;
            int r = 3 - rem;
            if(r < rem) minm += r;
            else minm += rem;
        }
        return minm;
    }
}