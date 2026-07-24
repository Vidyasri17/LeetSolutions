class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] present = new boolean[2048];
        for(int i: nums) present[i] = true;
        boolean[] pair = new boolean[2048];
        for(int i = 0; i < 2048; i++){
            if(!present[i]) continue;
            for(int j = 0; j < 2048; j++){
                if(!present[j]) continue;
                pair[i ^ j] = true;
            }
        }
        boolean[] ans = new boolean[2048];
        for(int i = 0; i < 2048; i++){
            if(!pair[i]) continue;
            for(int j = 0; j < 2048; j++){
                if(!present[j]) continue;
                ans[i ^ j] = true;
            }
        }
        int cnt = 0;
        for(int i = 0; i < 2048; i++){
            if(ans[i]) cnt++;
        }
        return cnt;
    }
}
