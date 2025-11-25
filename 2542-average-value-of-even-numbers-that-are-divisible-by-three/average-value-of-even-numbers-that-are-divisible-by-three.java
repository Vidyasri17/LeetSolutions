class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int cnt = 0;
        for(int i: nums){
            if(i % 6 == 0){
                sum += i;
                cnt++;
            }
        }
        if(cnt > 0) return (sum / cnt);
        return sum;   
    }
}