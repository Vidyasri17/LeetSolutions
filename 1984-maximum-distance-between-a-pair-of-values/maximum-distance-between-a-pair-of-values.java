class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        for(int i = 0; i < nums1.length; i++){
            int j = binary_search(nums2, i, nums2.length - 1, nums1[i]);
            if(j != -1) ans = Math.max(ans, j - i);
        }
        return ans;
    }
    public int binary_search(int[] arr, int low, int high, int target){

        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}