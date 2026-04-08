class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;

        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];

            int idx = l;
            while (idx <= r) {
                nums[idx] = (int)((1L * nums[idx] * v) % mod);
                idx += k;
            }
        }

        int xor = 0;
        for (int i : nums) xor ^= i;

        return xor;
    }
}