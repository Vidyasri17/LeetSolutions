class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] ps = new int[n];
        ps[0] = nums[0];
        for(int i = 1; i < n; i++){
            ps[i] = ps[i - 1] + nums[i];
        }
        if (ps[n - 1] < target){
            return 0;
        }
        int mnLength = n;
        int i = 0;
        int j = 0;
        while(i < n && j < n){
                int subArrSum = 0;
                if(i > 0) subArrSum = ps[j] - ps[i - 1];
                else subArrSum = ps[j];
                if(subArrSum >= target){
                    int currLen = j - i + 1;
                    if(currLen < mnLength){
                        mnLength = currLen;
                    }
		            i++;
                }else{
		            j++;
		        }
        }
        return mnLength;
    }
}