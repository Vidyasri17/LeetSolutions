class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans = ans ^ i;
        }
        int mask = ans & (-ans);
        int a = 0, b = 0;
        for(int i: nums){
            if((i & mask) == 0) a ^= i;
            else b ^= i;
        }
        return new int[] {a, b};
    }
}