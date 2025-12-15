class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        lst1.add(nums[0]);
        lst2.add(nums[1]);
        for(int i = 2; i < n; i++){
            if(lst1.getLast() > lst2.getLast()) lst1.add(nums[i]);
            else lst2.add(nums[i]);
        }
        int inx = 0;
        for(int i: lst1){
            nums[inx++] = i;
        }
        for(int i: lst2){
            nums[inx++] = i;
        }
        return nums;
    }
}