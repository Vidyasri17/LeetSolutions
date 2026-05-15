class Solution {
    public int alternateDigitSum(int n) {
        int sign = 1;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        int ans = 0;
        while(rev > 0){
            int rem = rev % 10;
            ans += rem * sign;
            sign *= -1;
            rev /= 10;
        }
        return ans;
    }
}