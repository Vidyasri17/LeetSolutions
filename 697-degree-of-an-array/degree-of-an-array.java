class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int maxFreq = -1;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > maxFreq){
                maxFreq = map.get(num);
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int num: map.keySet()){
            if(map.get(num) == maxFreq){
                int firstInx = -1, lastInx = -1;
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == num){
                        if(firstInx == -1){
                            firstInx = i;
                            lastInx = i;
                        }
                        else lastInx = i;
                    } 
                }
                ans = Math.min(ans, lastInx - firstInx + 1);
            }
        }
        return ans;
    }
}