class Solution {
    public int findComplement(int num) {
        int base = 1;
        int ans = 0;
        while(num > 0){
            if((num & 1) == 0){
                ans += base;
            }
            num = (num >> 1);
            base <<= 1;
        }
        return ans;
    }
}