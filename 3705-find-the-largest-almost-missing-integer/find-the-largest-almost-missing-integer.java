class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k == n){
            int maxi = -1;
            for(int num: nums) maxi = Math.max(num, maxi);
            return maxi;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if(k == 1){
            int maxi = -1;
            for(int i: map.keySet()){
                if(maxi < i && map.get(i) == 1){
                    maxi = i;
                }
            }
            return maxi;
        }
        int first = nums[0];
        int last = nums[n - 1];
        int ans = -1;
        if(map.get(first) == 1) ans = first;
        if(map.get(last) == 1) ans = Math.max(ans, last);
        return ans;
    }
}