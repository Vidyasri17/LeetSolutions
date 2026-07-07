class Solution {
    public long sumAndMultiply(int n) {
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        long x = 0;
        long sum = 0;
        while(rev > 0){
            int rem = rev % 10;
            if(rem > 0){
                x = x * 10 + rem;
                sum += rem;
            }
            rev /= 10;
        }
        return x * sum;
    }
}