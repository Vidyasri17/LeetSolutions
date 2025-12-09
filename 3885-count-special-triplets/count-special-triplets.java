class Solution {
    public int specialTriplets(int[] nums) {
        int MOD = 1000000007;
        long cnt = 0L;
        int n = nums.length;

        Map<Integer, Long> right = new HashMap<>();

        for(int i: nums) 
        right.put(i, right.getOrDefault(i, 0L) + 1L);

        Map<Integer, Long> left = new HashMap<>();

        for(int i = 0; i < n; i++){
            int temp = nums[i];
            right.put(temp, right.get(temp) - 1L);
            long need = 2L * temp;
            long leftCnt = left.getOrDefault((int)need, 0L);
            long rightCnt = right.getOrDefault((int)need, 0L);
            long add = ((leftCnt % MOD) * (rightCnt % MOD)) % MOD;
            cnt = (cnt + add) % MOD;
            left.put(temp, left.getOrDefault(temp, 0L) + 1L);
        }
        return (int) cnt;
    }
}