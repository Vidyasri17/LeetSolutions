class Solution {
    public int tribonacci(int n) {
        int f = 0, s = 1, t= 1;
        if(n <= 1) return n;
        if(n == 2) return 1;
        if(n == 3) return 2;
        for(int i = 4; i <= n + 1; i++){
            int curr = f + s + t;
            f = s;
            s = t;
            t = curr;
        }
        return t;
    }
}