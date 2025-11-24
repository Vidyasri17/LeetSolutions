class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxCnt = 0;
        Arrays.sort(divisors);
        int ele = divisors[0];
        for(int i: divisors){
            int cnt = 0;
            for(int j: nums){
                if(j % i == 0) cnt++;
            }
            
            if(maxCnt < cnt){
                maxCnt = cnt;
                ele = i;
            }
            if(maxCnt == cnt && i < ele) ele = i;
        }
        return ele;
    }
}