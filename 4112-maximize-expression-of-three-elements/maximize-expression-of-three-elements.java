class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        int a = -100, b = -100, c = 101;
        for(int num: nums){
            if(num > a){
                b = a;
                a = num;
            }
            else if(num > b && num <= a) b = num;
            if(num < c) c = num;
        }
        return a + b - c;
    }
}