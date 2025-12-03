class Solution {
    public boolean bs(int[] nums, int target, int s, int e){
        int m = 0;
        while(s <= e){
            m = s + (e - s) / 2;
            if(nums[m] == target) return true;
            if(nums[m] < target) s = m + 1;
            else e = m - 1;
        }
        return false;
    }
    public int pivotInx(int[] nums){
        int s = 0, e = nums.length - 1;
        int m;
        while(s <= e){
            m = s + (e - s) / 2;
            if(m < e && nums[m] > nums[m + 1]){
                return m;
            }
            if(m > s && nums[m - 1] > nums[m]){
                return (m - 1);
            }
            if(nums[s] == nums[m] && nums[m] == nums[e]){
                if(s < e && nums[s] > nums[s + 1]){
                    return s;
                }
                s++;
                if(e > s && nums[e] < nums[e - 1]){
                    return e - 1;
                }
                e--;
            }
            else if(nums[s] < nums[m] || (nums[s] == nums[m] && nums[e] < nums[m])){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        return -1;
    }
    public boolean search(int[] nums, int target) {
        int pivot = pivotInx(nums);
        if(pivot == -1) return bs(nums, target, 0, nums.length - 1);
        if(nums[pivot] == target) return true;
        if(target < nums[0]) return bs(nums, target, pivot + 1, nums.length - 1);
        return bs(nums, target, 0, pivot - 1);
    }
}