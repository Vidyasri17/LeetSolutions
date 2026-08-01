class Solution {
    public int[] evenOddBit(int n) {
        int odd = 0, even = 0;
        int inx = 0;
        while(n > 0){
            int bit = n % 2;
            n /= 2;
            if((inx & 1) == 1 && bit == 1) odd++;
            else if(bit == 1) even++;
            inx++;
        }
        int[] ans = {even, odd};
        return ans;
    }
}