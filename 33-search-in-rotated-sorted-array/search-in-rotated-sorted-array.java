class Solution {
    public int binarySearch(int[] nums, int target, int low, int high){
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public int pivotIndex(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(mid < high && nums[mid] > nums[mid + 1]){
                return mid;
            }
            else if(mid > low && nums[mid - 1] > nums[mid]){
                return (mid - 1);
            }
            else if(nums[low] >= nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int mx = pivotIndex(nums);
        System.out.println(mx);
        int ans =  binarySearch(nums, target, 0, mx);
        if(ans == -1) ans = binarySearch(nums, target, mx + 1, n - 1);
        return ans;
    }
}