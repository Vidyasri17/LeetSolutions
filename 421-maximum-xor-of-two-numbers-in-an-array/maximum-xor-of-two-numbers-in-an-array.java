class Solution {
    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int bit = 30; bit >= 0; bit--){
            HashSet<Integer> set = new HashSet<>();
            for(int i: nums){
                set.add(i >> bit);
            }
            int temp = (xor << 1) | 1;
            boolean found = false;
            for(int i: set){
                if(set.contains(i ^ temp)){
                    found = true;
                    break;
                }
            }
            if(found) xor = temp;
            else xor = temp - 1;
        }
        return xor;
    }
}