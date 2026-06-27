class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        for(int num: nums){
            sum += num;
            cnt += map.getOrDefault(sum - goal, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}