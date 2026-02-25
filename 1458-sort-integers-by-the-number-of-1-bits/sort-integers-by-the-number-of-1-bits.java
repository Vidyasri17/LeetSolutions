class Solution {
    public int[] sortByBits(int[] nums) {
        Integer[] boxed = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) boxed[i] = nums[i];
        Arrays.sort(boxed, (a, b) -> {
            int ca = Integer.bitCount(a);
            int cb = Integer.bitCount(b);
            if(ca != cb) return ca - cb;
            return a - b;
        });
        for(int i = 0; i < nums.length; i++) nums[i] = boxed[i];
        return nums;
    }
}