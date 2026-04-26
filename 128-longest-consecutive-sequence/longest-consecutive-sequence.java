class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        int ans = 0;
        for(int i: set){
            if(!set.contains(i - 1)){
                int cnt = 1;
                int curr  = i;
                while(set.contains(curr + 1)){
                    cnt++;
                    curr++;
                }
                ans = Math.max(cnt, ans);
            }
        }
        return ans;
    }
}