class Solution {
    public boolean uniformArray(int[] nums1) {
        int minEven = Integer.MAX_VALUE, minOdd = Integer.MAX_VALUE;
        for(int num: nums1){
            if(num % 2 == 0){
                minEven = Math.min(minEven, num);
            }
            else{
                minOdd = Math.min(minOdd, num);
            }
        }
        int n = nums1.length;
        boolean isPossible1 = true, isPossible2 = true;;
        for(int i = 0; i < n; i++){
            if(nums1[i] % 2 == 0){
                int diff = nums1[i] - minOdd;
                if(diff < 1 || diff % 2 == 0){
                    isPossible1 = false;
                }
            }
            if(nums1[i] % 2 == 1){
                int diff = nums1[i] - minEven;
                if(diff < 1 || diff % 2 == 1){
                    isPossible2 = false;
                }
            }
        }
        return isPossible2 || isPossible1;
    }
}