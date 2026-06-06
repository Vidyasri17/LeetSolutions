class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        for(int i = 0; i < n; i++){
            Set<Integer> s1 = new HashSet<>();
            Set<Integer> s2 = new HashSet<>();
            for(int j = 0; j <= i; j++){
                s1.add(nums[j]);
            }
            for(int k = i + 1; k < n; k++){
                s2.add(nums[k]);
            }
            diff[i] = s1.size() - s2.size();
        }
        return diff;
    }
}