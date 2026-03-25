class Solution {
    public int largestPerimeter(int[] nums) {
        int peri = 0;
        Arrays.sort(nums);
        for(int i = 0; i + 2 < nums.length; i++){
            int a = nums[i], b = nums[i + 1], c = nums[i + 2];
            if(a + b > c && c + b > a && a + c > b) peri = Math.max(peri, a + b + c);
        }
        return peri;
    }
}