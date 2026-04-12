class Solution {
    public void mergesort(int[] nums, int l, int h){
        if(l < h){
            int m = l + (h - l) / 2;
            mergesort(nums, l, m);
            mergesort(nums, m + 1, h);
            merge(nums, l, m, h);
        }
    }
    public void merge(int[] nums, int l, int m, int h){
        int[] res = new int[h - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;
        while(i <= m && j <= h){
            if(nums[i] <= nums[j]){
                res[k++] = nums[i++];
            }
            else{
                res[k++] = nums[j++];
            }
        }
        while(i <= m){
            res[k++] = nums[i++];
        }
        while(j <= h){
            res[k++] = nums[j++];
        }
        k = 0;
        for(i = l; i <= h; i++){
            nums[i] = res[k++];
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }
}