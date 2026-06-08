class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int inx = 0;
        int[] pivotArr = new int[n];
        for(int i: nums){
            if(i < pivot){
                pivotArr[inx++] = i;
            }
        }
        for(int i: nums){
            if(i == pivot){
                pivotArr[inx++] = i;
            }
        }
        for(int i: nums){
            if(i > pivot){
                pivotArr[inx++] = i;
            }
        }
        return pivotArr;
    }
}