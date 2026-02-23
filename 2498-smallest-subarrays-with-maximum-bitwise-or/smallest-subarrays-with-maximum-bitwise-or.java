class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] last = new int[32];
        Arrays.fill(last, -1);
        for(int i = n - 1; i >= 0; i--){
            int farthest = i;
            for(int j = 0; j < 32; j++){
                if((nums[i] & (1 << j)) != 0){
                    last[j] = i;
                }
                if(last[j] != -1){
                    farthest = Math.max(farthest, last[j]);
                }
            }
            res[i] = farthest - i + 1;
        }
        return res;
    }
}