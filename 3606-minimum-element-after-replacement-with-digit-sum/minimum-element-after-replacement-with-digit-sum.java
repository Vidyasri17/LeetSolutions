class Solution {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;;
        for(int i = 0; i < nums.length; i++){
            String s = Integer.toString(nums[i]);
            int temp = 0;
            for(int j = 0; j < s.length(); j++){
                char ch = s.charAt(j);
                temp += (int)(ch - '0');
            }
            mini = Math.min(mini, temp);
        }
        return mini;
    }
}