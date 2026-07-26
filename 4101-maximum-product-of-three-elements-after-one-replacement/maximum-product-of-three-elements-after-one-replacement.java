class Solution {
    public long maxProduct(int[] nums) {
        long ans = 100000l;
        int max1 = 0, max2 = 0;
        for(int i: nums){
            if(i < 0)  i *= -1;
            if(i > max1){
                max2 = max1;
                max1 = i;
            }
            else if(i >= max2) max2 = i;
        }
        ans *= max1;
        ans *= max2;
        return ans;
    }
}